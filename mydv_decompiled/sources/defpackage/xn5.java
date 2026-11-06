package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import androidx.media3.common.C;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xn5 implements GLSurfaceView.Renderer {
    public mp1 I;
    public v1 J;
    public final FloatBuffer K;
    public final FloatBuffer L;
    public final float[] M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public volatile boolean T;
    public volatile SurfaceTexture U;
    public volatile Surface V;
    public volatile int W;
    public volatile int X;
    public boolean Y;
    public final ArrayList Z;

    public xn5() {
        float[] fArr = wx5.t;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        this.K = asFloatBuffer;
        float[] fArr2 = wx5.u;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        this.L = asFloatBuffer2;
        this.M = new float[16];
        this.Z = new ArrayList();
    }

    public static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        Log.e("GlVideoSurfaceView", "编译着色器失败: " + GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void b(SurfaceTexture surfaceTexture, Surface surface) {
        try {
            surfaceTexture.setOnFrameAvailableListener(null);
        } catch (Exception e) {
            Log.w("GlVideoSurfaceView", "清理 SurfaceTexture 监听失败", e);
        }
        try {
            surfaceTexture.release();
        } catch (Exception e2) {
            Log.w("GlVideoSurfaceView", "释放 SurfaceTexture 失败", e2);
        }
        try {
            surface.release();
        } catch (Exception e3) {
            Log.w("GlVideoSurfaceView", "释放 Surface 失败", e3);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        int i;
        SurfaceTexture surfaceTexture = this.U;
        if (surfaceTexture == null) {
            return;
        }
        if (this.T) {
            this.T = false;
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.M);
            this.Y = true;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        if (!this.Y || (i = this.O) == 0) {
            return;
        }
        GLES20.glUseProgram(i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.N);
        GLES20.glUniform1i(this.S, 0);
        GLES20.glUniformMatrix4fv(this.R, 1, false, this.M, 0);
        this.K.position(0);
        GLES20.glVertexAttribPointer(this.P, 2, 5126, false, 0, (Buffer) this.K);
        GLES20.glEnableVertexAttribArray(this.P);
        this.L.position(0);
        GLES20.glVertexAttribPointer(this.Q, 2, 5126, false, 0, (Buffer) this.L);
        GLES20.glEnableVertexAttribArray(this.Q);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.P);
        GLES20.glDisableVertexAttribArray(this.Q);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int i = 0;
        this.Y = false;
        this.T = false;
        SurfaceTexture surfaceTexture = this.U;
        Surface surface = this.V;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        GLES20.glTexParameteri(36197, 10241, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(36197, 10240, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.N = i2;
        int a = a(35633, "\n    attribute vec4 aPosition;\n    attribute vec4 aTexCoord;\n    varying vec2 vTexCoord;\n    void main() {\n        gl_Position = aPosition;\n        vTexCoord = aTexCoord.xy;\n    }\n");
        int a2 = a(35632, "\n    #extension GL_OES_EGL_image_external : require\n    precision mediump float;\n    uniform samplerExternalOES uTexture;\n    uniform mat4 uTexMatrix;\n    varying vec2 vTexCoord;\n    void main() {\n        gl_FragColor = texture2D(uTexture, (uTexMatrix * vec4(vTexCoord, 0.0, 1.0)).xy);\n    }\n");
        if (a == 0 || a2 == 0) {
            Log.e("GlVideoSurfaceView", "着色器编译失败，GL 直通不可用");
        } else {
            int glCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(glCreateProgram, a);
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
            if (iArr2[0] != 1) {
                Log.e("GlVideoSurfaceView", "链接 GL 程序失败: " + GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                GLES20.glDeleteShader(a);
                GLES20.glDeleteShader(a2);
                i = glCreateProgram;
            }
        }
        this.O = i;
        if (i != 0) {
            this.P = GLES20.glGetAttribLocation(i, "aPosition");
            this.Q = GLES20.glGetAttribLocation(this.O, "aTexCoord");
            this.R = GLES20.glGetUniformLocation(this.O, "uTexMatrix");
            this.S = GLES20.glGetUniformLocation(this.O, "uTexture");
        }
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.N);
        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: vn5
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                xn5.this.T = true;
            }
        }, new Handler(Looper.getMainLooper()));
        Surface surface2 = new Surface(surfaceTexture2);
        this.U = surfaceTexture2;
        this.V = surface2;
        if (this.W > 0 && this.X > 0) {
            surfaceTexture2.setDefaultBufferSize(this.W, this.X);
        }
        if (surfaceTexture != null && surface != null) {
            this.Z.add(new uj3(surfaceTexture, surface));
        }
        v1 v1Var = this.J;
        if (v1Var != null) {
            v1Var.invoke(surface2);
        }
    }
}
