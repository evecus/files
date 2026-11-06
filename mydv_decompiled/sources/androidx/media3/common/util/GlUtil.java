package androidx.media3.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import androidx.media3.common.C;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.hf1;
import defpackage.j42;
import defpackage.s83;
import defpackage.sp0;
import defpackage.ux1;
import defpackage.x24;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class GlUtil {
    private static final String EXTENSION_COLORSPACE_BT2020_HLG = "EGL_EXT_gl_colorspace_bt2020_hlg";
    private static final String EXTENSION_COLORSPACE_BT2020_PQ = "EGL_EXT_gl_colorspace_bt2020_pq";
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    private static final long GL_FENCE_SYNC_FAILED = 0;
    public static final long GL_FENCE_SYNC_UNSET = -1;
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int MAX_BITMAP_DECODING_SIZE = 4096;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344, 12344};
    private static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    private GlUtil() {
    }

    private static void assertValidTextureSize(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        sp0.A(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new GlException("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new GlException(hf1.u(i3, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static void awaitSyncObject(long j) {
        if (j == -1) {
            return;
        }
        if (j == 0) {
            GLES20.glFinish();
        } else {
            GLES30.glWaitSync(j, 0, -1L);
            checkGlError();
        }
    }

    public static void bindTexture(int i, int i2, int i3) {
        GLES20.glBindTexture(i, i2);
        checkGlError();
        GLES20.glTexParameteri(i, 10240, i3);
        checkGlError();
        GLES20.glTexParameteri(i, 10241, i3);
        checkGlError();
        GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    public static void blitFrameBuffer(int i, GlRect glRect, int i2, GlRect glRect2) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36008, i);
        checkGlError();
        GLES20.glBindFramebuffer(36009, i2);
        checkGlError();
        GLES30.glBlitFramebuffer(glRect.left, glRect.bottom, glRect.right, glRect.top, glRect2.left, glRect2.bottom, glRect2.right, glRect2.top, 16384, C.TEXTURE_MIN_FILTER_LINEAR);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
    }

    public static void checkEglException(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new GlException(str + ", error code: 0x" + Integer.toHexString(eglGetError), dy1.t(Integer.valueOf(eglGetError)));
    }

    public static void checkGlError() {
        StringBuilder sb = new StringBuilder();
        j42.l(4, "initialCapacity");
        Object[] objArr = new Object[4];
        boolean z = false;
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i2 = i + 1;
            int b = ux1.b(objArr.length, i2);
            if (b > objArr.length) {
                objArr = Arrays.copyOf(objArr, b);
            }
            objArr[i] = valueOf;
            z = true;
            i = i2;
        }
        if (z) {
            throw new GlException(sb.toString(), dy1.m(i, objArr));
        }
    }

    public static void checkGlException(boolean z, String str) {
        if (!z) {
            throw new GlException(str);
        }
    }

    public static void clearFocusedBuffers() {
        clearFocusedBuffersInternal(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private static void clearFocusedBuffersInternal(float f, float f2, float f3, float f4) {
        GLES20.glClearColor(f, f2, f3, f4);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        checkGlError();
    }

    public static void clearFocusedBuffersOpaque() {
        clearFocusedBuffersInternal(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    private static FloatBuffer createBuffer(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) {
        boolean z = true;
        sp0.o(Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        if (i != 2 && i != 3) {
            z = false;
        }
        sp0.o(z);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eglCreateContext == null || eglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglTerminate(eGLDisplay);
            throw new GlException(hf1.u(i, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }
        checkEglException("Error in createEglContext");
        return eglCreateContext;
    }

    public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        int[] iArr;
        int[] iArr2;
        if (i == 3 || i == 10) {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
            iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
        } else {
            if (i != 7 && i != 6) {
                s83.t(hf1.u(i, "Unsupported color transfer: "));
                return null;
            }
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
            if (z) {
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
            } else if (i == 6) {
                if (!isBt2020PqExtensionSupported()) {
                    throw new GlException("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            } else {
                if (!isBt2020HlgExtensionSupported()) {
                    throw new GlException("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG;
            }
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
        checkEglException("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public static int createExternalTexture() {
        int generateTexture = generateTexture();
        bindTexture(36197, generateTexture, C.TEXTURE_MIN_FILTER_LINEAR);
        return generateTexture;
    }

    public static int createFboForTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        checkGlError();
        return iArr[0];
    }

    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        EGLSurface createPbufferSurface = isSurfacelessContextExtensionSupported() ? EGL14.EGL_NO_SURFACE : createPbufferSurface(eGLDisplay, 1, 1, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
        focusEglSurface(eGLDisplay, eGLContext, createPbufferSurface, 1, 1);
        return createPbufferSurface;
    }

    public static long createGlSyncFence() {
        if (getContextMajorVersion() < 3) {
            return 0L;
        }
        long glFenceSync = GLES30.glFenceSync(37143, 0);
        checkGlError();
        GLES20.glFlush();
        checkGlError();
        return glFenceSync;
    }

    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i, int i2, int[] iArr) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), new int[]{12375, i, 12374, i2, 12344}, 0);
        checkEglException("Error creating a new EGL Pbuffer surface");
        return eglCreatePbufferSurface;
    }

    public static int createPixelBufferObject(int i) {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindBuffer(35051, iArr[0]);
        checkGlError();
        GLES20.glBufferData(35051, i, null, 35049);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
        return iArr[0];
    }

    public static int createRgb10A2Texture(int i, int i2) {
        return createTextureUninitialized(i, i2, 32857, 33640);
    }

    public static int createTexture(int i, int i2, boolean z) {
        return z ? createTextureUninitialized(i, i2, 34842, 5131) : createTextureUninitialized(i, i2, 6408, 5121);
    }

    private static int createTextureUninitialized(int i, int i2, int i3, int i4) {
        assertValidTextureSize(i, i2);
        int generateTexture = generateTexture();
        bindTexture(3553, generateTexture, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, null);
        checkGlError();
        return generateTexture;
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    public static void deleteBuffer(int i) {
        GLES20.glDeleteBuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteFbo(int i) {
        GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i) {
        GLES20.glDeleteRenderbuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteSyncObject(long j) {
        deleteSyncObjectQuietly(j);
        checkGlError();
    }

    public static void deleteSyncObjectQuietly(long j) {
        if (j == -1) {
            return;
        }
        GLES30.glDeleteSync(j);
    }

    public static void deleteTexture(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        checkEglException("Error releasing context");
        if (eGLContext == null || eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        checkEglException("Error destroying context");
    }

    public static void destroyEglSurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        checkEglException("Error destroying surface");
    }

    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i, i2);
    }

    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i, i2, i3);
    }

    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        checkGlError();
        GLES20.glViewport(0, 0, i2, i3);
        checkGlError();
    }

    private static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        checkEglException("Error making context current");
        focusFramebufferUsingCurrentContext(i, i2, i3);
        if (eGLSurface.equals(EGL14.EGL_NO_SURFACE) || i != 0 || getContextMajorVersion() < 3) {
            return;
        }
        GLES30.glDrawBuffers(1, new int[]{AnalyticsListener.EVENT_AUDIO_CODEC_ERROR}, 0);
        checkGlError();
        GLES30.glReadBuffer(AnalyticsListener.EVENT_AUDIO_CODEC_ERROR);
        checkGlError();
    }

    public static int generateTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static long getContextMajorVersion() {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        checkGlError();
        return r0[0];
    }

    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay getDefaultEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        checkGlException(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        checkGlException(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        checkEglException("Error in getDefaultEglDisplay");
        return eglGetDisplay;
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlException("eglChooseConfig failed.");
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isBt2020HlgExtensionSupported() {
        return isExtensionSupported(EXTENSION_COLORSPACE_BT2020_HLG);
    }

    public static boolean isBt2020PqExtensionSupported() {
        return Build.VERSION.SDK_INT >= 33 && isExtensionSupported(EXTENSION_COLORSPACE_BT2020_PQ);
    }

    public static boolean isColorTransferSupported(int i) {
        if (i == 6) {
            return isBt2020PqExtensionSupported();
        }
        if (i == 7) {
            return isBt2020HlgExtensionSupported();
        }
        return true;
    }

    private static boolean isExtensionSupported(String str) {
        String eglQueryString = EGL14.eglQueryString(getDefaultEglDisplay(), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return isExtensionSupported(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        return isExtensionSupported(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static boolean isYuvTargetExtensionSupported() {
        String glGetString;
        if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay defaultEglDisplay = getDefaultEglDisplay();
                EGLContext createEglContext = createEglContext(defaultEglDisplay);
                createFocusedPlaceholderEglSurface(createEglContext, defaultEglDisplay);
                glGetString = GLES20.glGetString(7939);
                destroyEglContext(defaultEglDisplay, createEglContext);
            } catch (GlException unused) {
                return false;
            }
        } else {
            glGetString = GLES20.glGetString(7939);
        }
        return glGetString != null && glGetString.contains(EXTENSION_YUV_TARGET);
    }

    public static ByteBuffer mapPixelBufferObject(int i, int i2) {
        GLES20.glBindBuffer(35051, i);
        checkGlError();
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, i2, 1);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
        return byteBuffer;
    }

    public static void schedulePixelBufferRead(int i, int i2, int i3, int i4) {
        focusFramebufferUsingCurrentContext(i, i2, i3);
        GLES20.glBindBuffer(35051, i4);
        checkGlError();
        GLES30.glReadBuffer(36064);
        GLES30.glReadPixels(0, 0, i2, i3, 6408, 5121, 0);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
    }

    public static void setTexture(int i, Bitmap bitmap) {
        assertValidTextureSize(bitmap.getWidth(), bitmap.getHeight());
        bindTexture(3553, i, C.TEXTURE_MIN_FILTER_LINEAR);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        checkGlError();
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void terminate(EGLDisplay eGLDisplay) {
        EGL14.eglReleaseThread();
        checkEglException("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        checkEglException("Error terminating display");
    }

    public static void unmapPixelBufferObject(int i) {
        GLES20.glBindBuffer(35051, i);
        checkGlError();
        GLES30.glUnmapBuffer(35051);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class GlException extends Exception {
        public final dy1 errorCodes;

        public GlException(String str, List<Integer> list) {
            super(str);
            this.errorCodes = dy1.p(list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GlException(String str) {
            this(str, x24.M);
            ay1 ay1Var = dy1.J;
        }
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    public static int createTexture(Bitmap bitmap) {
        int generateTexture = generateTexture();
        setTexture(generateTexture, bitmap);
        return generateTexture;
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) {
        return createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }
}
