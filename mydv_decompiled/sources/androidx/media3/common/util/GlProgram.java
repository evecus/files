package androidx.media3.common.util;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Build;
import androidx.media3.common.C;
import defpackage.sp0;
import defpackage.zl1;
import defpackage.zy;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final Map<String, Attribute> attributeByName;
    private final Attribute[] attributes;
    private boolean externalTexturesRequireNearestSampling;
    private final int programId;
    private final Map<String, Uniform> uniformByName;
    private final Uniform[] uniforms;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Attribute {
        private Buffer buffer;
        private final int location;
        public final String name;
        private int size;

        private Attribute(String str, int i) {
            this.name = str;
            this.location = i;
        }

        public static Attribute create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new Attribute(str, GlProgram.getAttributeLocation(i, str));
        }

        public void bind() {
            Buffer buffer = this.buffer;
            sp0.w(buffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.location, this.size, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.location);
            GlUtil.checkGlError();
        }

        public void setBuffer(float[] fArr, int i) {
            this.buffer = GlUtil.createBuffer(fArr);
            this.size = i;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Uniform {
        private final int location;
        public final String name;
        private int texIdValue;
        private int texUnitIndex;
        private final int type;
        private final float[] floatValue = new float[16];
        private final int[] intValue = new int[4];
        private int texMinFilter = C.TEXTURE_MIN_FILTER_LINEAR;

        private Uniform(String str, int i, int i2) {
            this.name = str;
            this.location = i;
            this.type = i2;
        }

        public static Uniform create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new Uniform(str, GlProgram.getUniformLocation(i, str), iArr2[0]);
        }

        public void bind(boolean z) {
            int i;
            int i2 = this.type;
            if (i2 == 5124) {
                GLES20.glUniform1iv(this.location, 1, this.intValue, 0);
                GlUtil.checkGlError();
                return;
            }
            if (i2 == 5126) {
                GLES20.glUniform1fv(this.location, 1, this.floatValue, 0);
                GlUtil.checkGlError();
                return;
            }
            if (i2 != GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT && i2 != 36198) {
                switch (i2) {
                    case 35664:
                        GLES20.glUniform2fv(this.location, 1, this.floatValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35665:
                        GLES20.glUniform3fv(this.location, 1, this.floatValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35666:
                        GLES20.glUniform4fv(this.location, 1, this.floatValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35667:
                        GLES20.glUniform2iv(this.location, 1, this.intValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35668:
                        GLES20.glUniform3iv(this.location, 1, this.intValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35669:
                        GLES20.glUniform4iv(this.location, 1, this.intValue, 0);
                        GlUtil.checkGlError();
                        return;
                    default:
                        switch (i2) {
                            case 35675:
                                GLES20.glUniformMatrix3fv(this.location, 1, false, this.floatValue, 0);
                                GlUtil.checkGlError();
                                return;
                            case 35676:
                                GLES20.glUniformMatrix4fv(this.location, 1, false, this.floatValue, 0);
                                GlUtil.checkGlError();
                                return;
                            default:
                                switch (i2) {
                                    case 35678:
                                    case 35679:
                                        break;
                                    default:
                                        zl1.d(this.type, "Unexpected uniform type: ");
                                        break;
                                }
                                return;
                        }
                }
            }
            if (this.texIdValue == 0) {
                zy.i("No call to setSamplerTexId() before bind.");
                return;
            }
            GLES20.glActiveTexture(this.texUnitIndex + 33984);
            GlUtil.checkGlError();
            int i3 = this.type;
            int i4 = C.TEXTURE_MIN_FILTER_LINEAR;
            switch (i3) {
                case 35678:
                    i = 3553;
                    break;
                case 35679:
                    i = 32879;
                    break;
                case GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT /* 35815 */:
                case 36198:
                    if (z) {
                        i4 = 9728;
                    }
                    i = 36197;
                    break;
                default:
                    zl1.d(this.type, "Unexpected sampler type: ");
                    return;
            }
            GlUtil.bindTexture(i, this.texIdValue, i4);
            if (this.type == 35678) {
                if (this.texMinFilter == 9987) {
                    GLES20.glGenerateMipmap(3553);
                    GlUtil.checkGlError();
                }
                GLES20.glTexParameteri(3553, 10241, this.texMinFilter);
                GlUtil.checkGlError();
            }
            GLES20.glUniform1i(this.location, this.texUnitIndex);
            GlUtil.checkGlError();
        }

        public void setFloat(float f) {
            this.floatValue[0] = f;
        }

        public void setFloats(float[] fArr) {
            System.arraycopy(fArr, 0, this.floatValue, 0, fArr.length);
        }

        public void setInt(int i) {
            this.intValue[0] = i;
        }

        public void setInts(int[] iArr) {
            System.arraycopy(iArr, 0, this.intValue, 0, iArr.length);
        }

        public void setSamplerTexId(int i, int i2) {
            this.texIdValue = i;
            this.texUnitIndex = i2;
        }

        public void setTexMinFilter(int i) {
            this.texMinFilter = i;
        }
    }

    public GlProgram(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.programId = glCreateProgram;
        GlUtil.checkGlError();
        addShader(glCreateProgram, 35633, str);
        addShader(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        GlUtil.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.attributeByName = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.attributes = new Attribute[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            Attribute create = Attribute.create(this.programId, i);
            this.attributes[i] = create;
            this.attributeByName.put(create.name, create);
        }
        this.uniformByName = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.programId, 35718, iArr3, 0);
        this.uniforms = new Uniform[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            Uniform create2 = Uniform.create(this.programId, i2);
            this.uniforms[i2] = create2;
            this.uniformByName.put(create2.name, create2);
        }
        GlUtil.checkGlError();
    }

    private static void addShader(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        GlUtil.checkGlException(iArr[0] == 1, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        GlUtil.checkGlError();
    }

    private int getAttributeLocation(String str) {
        return getAttributeLocation(this.programId, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    public void bindAttributesAndUniforms() {
        for (Attribute attribute : this.attributes) {
            attribute.bind();
        }
        for (Uniform uniform : this.uniforms) {
            uniform.bind(this.externalTexturesRequireNearestSampling);
        }
    }

    public void delete() {
        if (Build.VERSION.SDK_INT == 28) {
            return;
        }
        GLES20.glDeleteProgram(this.programId);
        GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) {
        int attributeLocation = getAttributeLocation(str);
        GLES20.glEnableVertexAttribArray(attributeLocation);
        GlUtil.checkGlError();
        return attributeLocation;
    }

    public int getUniformLocation(String str) {
        return getUniformLocation(this.programId, str);
    }

    public void setBufferAttribute(String str, float[] fArr, int i) {
        Attribute attribute = this.attributeByName.get(str);
        attribute.getClass();
        attribute.setBuffer(fArr, i);
    }

    public void setExternalTexturesRequireNearestSampling(boolean z) {
        this.externalTexturesRequireNearestSampling = z;
    }

    public void setFloatUniform(String str, float f) {
        Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setFloat(f);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setFloats(fArr);
    }

    public void setFloatsUniformIfPresent(String str, float[] fArr) {
        Uniform uniform = this.uniformByName.get(str);
        if (uniform == null) {
            return;
        }
        uniform.setFloats(fArr);
    }

    public void setIntUniform(String str, int i) {
        Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setInt(i);
    }

    public void setIntsUniform(String str, int[] iArr) {
        Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setInts(iArr);
    }

    public void setSamplerTexIdUniform(String str, int i, int i2, int i3) {
        Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setSamplerTexId(i, i2);
        uniform.setTexMinFilter(i3);
    }

    public void use() {
        GLES20.glUseProgram(this.programId);
        GlUtil.checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public void setSamplerTexIdUniform(String str, int i, int i2) {
        Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setSamplerTexId(i, i2);
    }

    public GlProgram(Context context, String str, String str2) {
        this(Util.loadAsset(context, str), Util.loadAsset(context, str2));
    }

    public GlProgram(Context context, int i, int i2) {
        this(Util.loadRawResource(context, i), Util.loadRawResource(context, i2));
    }
}
