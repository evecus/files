package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.media3.extractor.ts.TsExtractor;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xb1 {
    public static final byte[] A;
    public static final byte[] B;
    public static final String[] C;
    public static final int[] D;
    public static final byte[] E;
    public static final ub1 F;
    public static final ub1[][] G;
    public static final ub1[] H;
    public static final HashMap[] I;
    public static final HashMap[] J;
    public static final Set K;
    public static final HashMap L;
    public static final Charset M;
    public static final byte[] N;
    public static final byte[] O;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final int[] n;
    public static final int[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public tb1 l;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        n = new int[]{8, 8, 8};
        o = new int[]{8};
        p = new byte[]{-1, -40, -1};
        q = new byte[]{102, 116, 121, 112};
        r = new byte[]{109, 105, 102, 49};
        s = new byte[]{104, 101, 105, 99};
        t = new byte[]{97, 118, 105, 102};
        u = new byte[]{97, 118, 105, 115};
        v = new byte[]{79, 76, 89, 77, 80, 0};
        w = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        x = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        y = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        z = new byte[]{82, 73, 70, 70};
        A = new byte[]{87, 69, 66, 80};
        B = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ub1[] ub1VarArr = {new ub1("NewSubfileType", 254, 4), new ub1("SubfileType", 255, 4), new ub1("ImageWidth", 256, 3, 4), new ub1("ImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new ub1("BitsPerSample", 258, 3), new ub1("Compression", 259, 3), new ub1("PhotometricInterpretation", 262, 3), new ub1("ImageDescription", 270, 2), new ub1("Make", 271, 2), new ub1("Model", 272, 2), new ub1("StripOffsets", 273, 3, 4), new ub1("Orientation", 274, 3), new ub1("SamplesPerPixel", 277, 3), new ub1("RowsPerStrip", 278, 3, 4), new ub1("StripByteCounts", 279, 3, 4), new ub1("XResolution", 282, 5), new ub1("YResolution", 283, 5), new ub1("PlanarConfiguration", 284, 3), new ub1("ResolutionUnit", 296, 3), new ub1("TransferFunction", 301, 3), new ub1("Software", 305, 2), new ub1("DateTime", 306, 2), new ub1("Artist", 315, 2), new ub1("WhitePoint", 318, 5), new ub1("PrimaryChromaticities", 319, 5), new ub1("SubIFDPointer", 330, 4), new ub1("JPEGInterchangeFormat", 513, 4), new ub1("JPEGInterchangeFormatLength", 514, 4), new ub1("YCbCrCoefficients", 529, 5), new ub1("YCbCrSubSampling", 530, 3), new ub1("YCbCrPositioning", 531, 3), new ub1("ReferenceBlackWhite", 532, 5), new ub1("Copyright", 33432, 2), new ub1("ExifIFDPointer", 34665, 4), new ub1("GPSInfoIFDPointer", 34853, 4), new ub1("SensorTopBorder", 4, 4), new ub1("SensorLeftBorder", 5, 4), new ub1("SensorBottomBorder", 6, 4), new ub1("SensorRightBorder", 7, 4), new ub1("ISO", 23, 3), new ub1("JpgFromRaw", 46, 7), new ub1("Xmp", 700, 1)};
        ub1[] ub1VarArr2 = {new ub1("ExposureTime", 33434, 5), new ub1("FNumber", 33437, 5), new ub1("ExposureProgram", 34850, 3), new ub1("SpectralSensitivity", 34852, 2), new ub1("PhotographicSensitivity", 34855, 3), new ub1("OECF", 34856, 7), new ub1("SensitivityType", 34864, 3), new ub1("StandardOutputSensitivity", 34865, 4), new ub1("RecommendedExposureIndex", 34866, 4), new ub1("ISOSpeed", 34867, 4), new ub1("ISOSpeedLatitudeyyy", 34868, 4), new ub1("ISOSpeedLatitudezzz", 34869, 4), new ub1("ExifVersion", 36864, 2), new ub1("DateTimeOriginal", 36867, 2), new ub1("DateTimeDigitized", 36868, 2), new ub1("OffsetTime", 36880, 2), new ub1("OffsetTimeOriginal", 36881, 2), new ub1("OffsetTimeDigitized", 36882, 2), new ub1("ComponentsConfiguration", 37121, 7), new ub1("CompressedBitsPerPixel", 37122, 5), new ub1("ShutterSpeedValue", 37377, 10), new ub1("ApertureValue", 37378, 5), new ub1("BrightnessValue", 37379, 10), new ub1("ExposureBiasValue", 37380, 10), new ub1("MaxApertureValue", 37381, 5), new ub1("SubjectDistance", 37382, 5), new ub1("MeteringMode", 37383, 3), new ub1("LightSource", 37384, 3), new ub1("Flash", 37385, 3), new ub1("FocalLength", 37386, 5), new ub1("SubjectArea", 37396, 3), new ub1("MakerNote", 37500, 7), new ub1("UserComment", 37510, 7), new ub1("SubSecTime", 37520, 2), new ub1("SubSecTimeOriginal", 37521, 2), new ub1("SubSecTimeDigitized", 37522, 2), new ub1("FlashpixVersion", 40960, 7), new ub1("ColorSpace", 40961, 3), new ub1("PixelXDimension", 40962, 3, 4), new ub1("PixelYDimension", 40963, 3, 4), new ub1("RelatedSoundFile", 40964, 2), new ub1("InteroperabilityIFDPointer", 40965, 4), new ub1("FlashEnergy", 41483, 5), new ub1("SpatialFrequencyResponse", 41484, 7), new ub1("FocalPlaneXResolution", 41486, 5), new ub1("FocalPlaneYResolution", 41487, 5), new ub1("FocalPlaneResolutionUnit", 41488, 3), new ub1("SubjectLocation", 41492, 3), new ub1("ExposureIndex", 41493, 5), new ub1("SensingMethod", 41495, 3), new ub1("FileSource", 41728, 7), new ub1("SceneType", 41729, 7), new ub1("CFAPattern", 41730, 7), new ub1("CustomRendered", 41985, 3), new ub1("ExposureMode", 41986, 3), new ub1("WhiteBalance", 41987, 3), new ub1("DigitalZoomRatio", 41988, 5), new ub1("FocalLengthIn35mmFilm", 41989, 3), new ub1("SceneCaptureType", 41990, 3), new ub1("GainControl", 41991, 3), new ub1("Contrast", 41992, 3), new ub1("Saturation", 41993, 3), new ub1("Sharpness", 41994, 3), new ub1("DeviceSettingDescription", 41995, 7), new ub1("SubjectDistanceRange", 41996, 3), new ub1("ImageUniqueID", 42016, 2), new ub1("CameraOwnerName", 42032, 2), new ub1("BodySerialNumber", 42033, 2), new ub1("LensSpecification", 42034, 5), new ub1("LensMake", 42035, 2), new ub1("LensModel", 42036, 2), new ub1("Gamma", 42240, 5), new ub1("DNGVersion", 50706, 1), new ub1("DefaultCropSize", 50720, 3, 4)};
        ub1[] ub1VarArr3 = {new ub1("GPSVersionID", 0, 1), new ub1("GPSLatitudeRef", 1, 2), new ub1("GPSLatitude", 2, 5, 10), new ub1("GPSLongitudeRef", 3, 2), new ub1("GPSLongitude", 4, 5, 10), new ub1("GPSAltitudeRef", 5, 1), new ub1("GPSAltitude", 6, 5), new ub1("GPSTimeStamp", 7, 5), new ub1("GPSSatellites", 8, 2), new ub1("GPSStatus", 9, 2), new ub1("GPSMeasureMode", 10, 2), new ub1("GPSDOP", 11, 5), new ub1("GPSSpeedRef", 12, 2), new ub1("GPSSpeed", 13, 5), new ub1("GPSTrackRef", 14, 2), new ub1("GPSTrack", 15, 5), new ub1("GPSImgDirectionRef", 16, 2), new ub1("GPSImgDirection", 17, 5), new ub1("GPSMapDatum", 18, 2), new ub1("GPSDestLatitudeRef", 19, 2), new ub1("GPSDestLatitude", 20, 5), new ub1("GPSDestLongitudeRef", 21, 2), new ub1("GPSDestLongitude", 22, 5), new ub1("GPSDestBearingRef", 23, 2), new ub1("GPSDestBearing", 24, 5), new ub1("GPSDestDistanceRef", 25, 2), new ub1("GPSDestDistance", 26, 5), new ub1("GPSProcessingMethod", 27, 7), new ub1("GPSAreaInformation", 28, 7), new ub1("GPSDateStamp", 29, 2), new ub1("GPSDifferential", 30, 3), new ub1("GPSHPositioningError", 31, 5)};
        ub1[] ub1VarArr4 = {new ub1("InteroperabilityIndex", 1, 2)};
        ub1[] ub1VarArr5 = {new ub1("NewSubfileType", 254, 4), new ub1("SubfileType", 255, 4), new ub1("ThumbnailImageWidth", 256, 3, 4), new ub1("ThumbnailImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new ub1("BitsPerSample", 258, 3), new ub1("Compression", 259, 3), new ub1("PhotometricInterpretation", 262, 3), new ub1("ImageDescription", 270, 2), new ub1("Make", 271, 2), new ub1("Model", 272, 2), new ub1("StripOffsets", 273, 3, 4), new ub1("ThumbnailOrientation", 274, 3), new ub1("SamplesPerPixel", 277, 3), new ub1("RowsPerStrip", 278, 3, 4), new ub1("StripByteCounts", 279, 3, 4), new ub1("XResolution", 282, 5), new ub1("YResolution", 283, 5), new ub1("PlanarConfiguration", 284, 3), new ub1("ResolutionUnit", 296, 3), new ub1("TransferFunction", 301, 3), new ub1("Software", 305, 2), new ub1("DateTime", 306, 2), new ub1("Artist", 315, 2), new ub1("WhitePoint", 318, 5), new ub1("PrimaryChromaticities", 319, 5), new ub1("SubIFDPointer", 330, 4), new ub1("JPEGInterchangeFormat", 513, 4), new ub1("JPEGInterchangeFormatLength", 514, 4), new ub1("YCbCrCoefficients", 529, 5), new ub1("YCbCrSubSampling", 530, 3), new ub1("YCbCrPositioning", 531, 3), new ub1("ReferenceBlackWhite", 532, 5), new ub1("Copyright", 33432, 2), new ub1("ExifIFDPointer", 34665, 4), new ub1("GPSInfoIFDPointer", 34853, 4), new ub1("DNGVersion", 50706, 1), new ub1("DefaultCropSize", 50720, 3, 4)};
        F = new ub1("StripOffsets", 273, 3);
        G = new ub1[][]{ub1VarArr, ub1VarArr2, ub1VarArr3, ub1VarArr4, ub1VarArr5, ub1VarArr, new ub1[]{new ub1("ThumbnailImage", 256, 7), new ub1("CameraSettingsIFDPointer", 8224, 4), new ub1("ImageProcessingIFDPointer", 8256, 4)}, new ub1[]{new ub1("PreviewImageStart", TsExtractor.TS_STREAM_TYPE_AIT, 4), new ub1("PreviewImageLength", 258, 4)}, new ub1[]{new ub1("AspectFrame", 4371, 3)}, new ub1[]{new ub1("ColorSpace", 55, 3)}};
        H = new ub1[]{new ub1("SubIFDPointer", 330, 4), new ub1("ExifIFDPointer", 34665, 4), new ub1("GPSInfoIFDPointer", 34853, 4), new ub1("InteroperabilityIFDPointer", 40965, 4), new ub1("CameraSettingsIFDPointer", 8224, 1), new ub1("ImageProcessingIFDPointer", 8256, 1)};
        I = new HashMap[10];
        J = new HashMap[10];
        K = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        L = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        M = forName;
        N = "Exif\u0000\u0000".getBytes(forName);
        O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            ub1[][] ub1VarArr6 = G;
            if (i >= ub1VarArr6.length) {
                HashMap hashMap = L;
                ub1[] ub1VarArr7 = H;
                hashMap.put(Integer.valueOf(ub1VarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(ub1VarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(ub1VarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(ub1VarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(ub1VarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(ub1VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            I[i] = new HashMap();
            J[i] = new HashMap();
            for (ub1 ub1Var : ub1VarArr6[i]) {
                I[i].put(Integer.valueOf(ub1Var.a), ub1Var);
                J[i].put(ub1Var.b, ub1Var);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:6:0x004f, B:8:0x0052, B:10:0x0067, B:16:0x0084, B:23:0x0097, B:24:0x00aa, B:33:0x009f, B:34:0x00a3, B:35:0x00a7, B:36:0x00b4, B:38:0x00bd, B:40:0x00c3, B:42:0x00c9, B:44:0x00cf, B:54:0x00dd), top: B:5:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xb1(java.io.InputStream r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb1.<init>(java.io.InputStream):void");
    }

    public static ByteOrder q(sb1 sb1Var) {
        short readShort = sb1Var.readShort();
        boolean z2 = m;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            zl1.f(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.d;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat("\u0000").getBytes(M);
            hashMap.put("DateTime", new tb1(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", tb1.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", tb1.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", tb1.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", tb1.a(0L, this.f));
        }
    }

    public final String b(String str) {
        tb1 c = c(str);
        if (c != null) {
            int i = c.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                vb1[] vb1VarArr = (vb1[]) c.g(this.f);
                if (vb1VarArr == null || vb1VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(vb1VarArr));
                    return null;
                }
                vb1 vb1Var = vb1VarArr[0];
                Integer valueOf = Integer.valueOf((int) (vb1Var.a / vb1Var.b));
                vb1 vb1Var2 = vb1VarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (vb1Var2.a / vb1Var2.b));
                vb1 vb1Var3 = vb1VarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (vb1Var3.a / vb1Var3.b)));
            }
            boolean contains = K.contains(str);
            ByteOrder byteOrder = this.f;
            if (!contains) {
                return c.f(byteOrder);
            }
            try {
                return Double.toString(c.d(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final tb1 c(String str) {
        tb1 tb1Var;
        int i;
        tb1 tb1Var2;
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.c) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (tb1Var2 = this.l) != null)) {
            return tb1Var2;
        }
        for (int i2 = 0; i2 < G.length; i2++) {
            tb1 tb1Var3 = (tb1) this.d[i2].get(str);
            if (tb1Var3 != null) {
                return tb1Var3;
            }
        }
        if (!"Xmp".equals(str) || (tb1Var = this.l) == null) {
            return null;
        }
        return tb1Var;
    }

    public final void d(wb1 wb1Var, int i) {
        String str;
        String str2;
        String str3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            zy.p("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i2 < 31) {
            zy.p("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                c21.H(mediaMetadataRetriever, new rb1(wb1Var));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", tb1.c(Integer.parseInt(str), this.f));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", tb1.c(Integer.parseInt(str3), this.f));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", tb1.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    wb1Var.g(parseInt2);
                    byte[] bArr = new byte[6];
                    wb1Var.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, N)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    wb1Var.readFully(bArr2);
                    this.h = i3;
                    r(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    wb1Var.g(j);
                    byte[] bArr3 = new byte[parseInt5];
                    wb1Var.readFully(bArr3);
                    this.l = new tb1(j, bArr3, 1, parseInt5);
                }
                if (m) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } finally {
            }
        } catch (RuntimeException e) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        r23.K = r22.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f A[LOOP:0: B:9:0x0034->B:35:0x015f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.sb1 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb1.e(sb1, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00f4, code lost:
    
        if (r7 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r20) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb1.f(java.io.BufferedInputStream):int");
    }

    public final void g(wb1 wb1Var) {
        int i;
        int i2;
        j(wb1Var);
        HashMap[] hashMapArr = this.d;
        tb1 tb1Var = (tb1) hashMapArr[1].get("MakerNote");
        if (tb1Var != null) {
            wb1 wb1Var2 = new wb1(tb1Var.d);
            wb1Var2.K = this.f;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            wb1Var2.readFully(bArr2);
            wb1Var2.g(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            wb1Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                wb1Var2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                wb1Var2.g(12L);
            }
            s(wb1Var2, 6);
            tb1 tb1Var2 = (tb1) hashMapArr[7].get("PreviewImageStart");
            tb1 tb1Var3 = (tb1) hashMapArr[7].get("PreviewImageLength");
            if (tb1Var2 != null && tb1Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", tb1Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", tb1Var3);
            }
            tb1 tb1Var4 = (tb1) hashMapArr[8].get("AspectFrame");
            if (tb1Var4 != null) {
                int[] iArr = (int[]) tb1Var4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                tb1 c = tb1.c(i5, this.f);
                tb1 c2 = tb1.c(i6, this.f);
                hashMapArr[0].put("ImageWidth", c);
                hashMapArr[0].put("ImageLength", c2);
            }
        }
    }

    public final void h(sb1 sb1Var) {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + sb1Var);
        }
        sb1Var.K = ByteOrder.BIG_ENDIAN;
        int i = sb1Var.J;
        sb1Var.e(x.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int readInt = sb1Var.readInt();
                int readInt2 = sb1Var.readInt();
                int i2 = sb1Var.J;
                int i3 = i2 + readInt + 4;
                int i4 = i2 - i;
                if (i4 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z2) {
                    this.h = i4;
                    byte[] bArr = new byte[readInt];
                    sb1Var.readFully(bArr);
                    int readInt3 = sb1Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    r(0, bArr);
                    x();
                    u(new sb1(bArr));
                    z2 = true;
                } else if (readInt2 == 1767135348 && !z3) {
                    byte[] bArr2 = y;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        sb1Var.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i5 = sb1Var.J - i;
                            int i6 = readInt - length;
                            byte[] bArr4 = new byte[i6];
                            sb1Var.readFully(bArr4);
                            this.l = new tb1(i5, bArr4, 1, i6);
                            z3 = true;
                        }
                    }
                }
                sb1Var.e(i3 - sb1Var.J);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void i(sb1 sb1Var) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + sb1Var);
        }
        sb1Var.e(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        sb1Var.readFully(bArr);
        sb1Var.readFully(bArr2);
        sb1Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        sb1Var.e(i - sb1Var.J);
        sb1Var.readFully(bArr4);
        e(new sb1(bArr4), i, 5);
        sb1Var.e(i3 - sb1Var.J);
        sb1Var.K = ByteOrder.BIG_ENDIAN;
        int readInt = sb1Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = sb1Var.readUnsignedShort();
            int readUnsignedShort2 = sb1Var.readUnsignedShort();
            if (readUnsignedShort == F.a) {
                short readShort = sb1Var.readShort();
                short readShort2 = sb1Var.readShort();
                tb1 c = tb1.c(readShort, this.f);
                tb1 c2 = tb1.c(readShort2, this.f);
                HashMap[] hashMapArr = this.d;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            sb1Var.e(readUnsignedShort2);
        }
    }

    public final void j(wb1 wb1Var) {
        o(wb1Var);
        s(wb1Var, 0);
        w(wb1Var, 0);
        w(wb1Var, 5);
        w(wb1Var, 4);
        x();
        if (this.c == 8) {
            HashMap[] hashMapArr = this.d;
            tb1 tb1Var = (tb1) hashMapArr[1].get("MakerNote");
            if (tb1Var != null) {
                wb1 wb1Var2 = new wb1(tb1Var.d);
                wb1Var2.K = this.f;
                wb1Var2.e(6);
                s(wb1Var2, 9);
                tb1 tb1Var2 = (tb1) hashMapArr[9].get("ColorSpace");
                if (tb1Var2 != null) {
                    hashMapArr[1].put("ColorSpace", tb1Var2);
                }
            }
        }
    }

    public final void k(wb1 wb1Var) {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + wb1Var);
        }
        j(wb1Var);
        HashMap[] hashMapArr = this.d;
        tb1 tb1Var = (tb1) hashMapArr[0].get("JpgFromRaw");
        if (tb1Var != null) {
            e(new sb1(tb1Var.d), (int) tb1Var.c, 5);
        }
        tb1 tb1Var2 = (tb1) hashMapArr[0].get("ISO");
        tb1 tb1Var3 = (tb1) hashMapArr[1].get("PhotographicSensitivity");
        if (tb1Var2 == null || tb1Var3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", tb1Var2);
    }

    public final void l(sb1 sb1Var) {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + sb1Var);
        }
        sb1Var.K = ByteOrder.LITTLE_ENDIAN;
        sb1Var.e(z.length);
        int readInt = sb1Var.readInt() + 8;
        byte[] bArr = A;
        sb1Var.e(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                sb1Var.readFully(bArr2);
                int readInt2 = sb1Var.readInt();
                int i = length + 8;
                if (Arrays.equals(B, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    sb1Var.readFully(bArr3);
                    byte[] bArr4 = N;
                    if (e21.R(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.h = i;
                    r(0, bArr3);
                    u(new sb1(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                sb1Var.e(readInt2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void m(sb1 sb1Var, HashMap hashMap) {
        tb1 tb1Var = (tb1) hashMap.get("JPEGInterchangeFormat");
        tb1 tb1Var2 = (tb1) hashMap.get("JPEGInterchangeFormatLength");
        if (tb1Var == null || tb1Var2 == null) {
            return;
        }
        int e = tb1Var.e(this.f);
        int e2 = tb1Var2.e(this.f);
        if (this.c == 7) {
            e += this.i;
        }
        if (e > 0 && e2 > 0 && this.b == null && this.a == null) {
            sb1Var.e(e);
            sb1Var.readFully(new byte[e2]);
        }
        if (m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
        }
    }

    public final boolean n(HashMap hashMap) {
        tb1 tb1Var = (tb1) hashMap.get("ImageLength");
        tb1 tb1Var2 = (tb1) hashMap.get("ImageWidth");
        if (tb1Var == null || tb1Var2 == null) {
            return false;
        }
        return tb1Var.e(this.f) <= 512 && tb1Var2.e(this.f) <= 512;
    }

    public final void o(wb1 wb1Var) {
        ByteOrder q2 = q(wb1Var);
        this.f = q2;
        wb1Var.K = q2;
        int readUnsignedShort = wb1Var.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            zl1.f(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = wb1Var.readInt();
        if (readInt < 8) {
            zl1.g(hf1.u(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            wb1Var.e(i2);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.d;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder C2 = hf1.C("The size of tag group[", i, "]: ");
            C2.append(hashMapArr[i].size());
            Log.d("ExifInterface", C2.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                tb1 tb1Var = (tb1) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + tb1Var.toString() + ", tagValue: '" + tb1Var.f(this.f) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) {
        wb1 wb1Var = new wb1(bArr);
        o(wb1Var);
        s(wb1Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.wb1 r36, int r37) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb1.s(wb1, int):void");
    }

    public final void t(String str, int i, String str2) {
        HashMap[] hashMapArr = this.d;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (tb1) hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void u(sb1 sb1Var) {
        tb1 tb1Var;
        int e;
        HashMap hashMap = this.d[4];
        tb1 tb1Var2 = (tb1) hashMap.get("Compression");
        if (tb1Var2 == null) {
            m(sb1Var, hashMap);
            return;
        }
        int e2 = tb1Var2.e(this.f);
        if (e2 != 1) {
            if (e2 == 6) {
                m(sb1Var, hashMap);
                return;
            } else if (e2 != 7) {
                return;
            }
        }
        tb1 tb1Var3 = (tb1) hashMap.get("BitsPerSample");
        if (tb1Var3 != null) {
            int[] iArr = (int[]) tb1Var3.g(this.f);
            int[] iArr2 = n;
            if (Arrays.equals(iArr2, iArr) || (this.c == 3 && (tb1Var = (tb1) hashMap.get("PhotometricInterpretation")) != null && (((e = tb1Var.e(this.f)) == 1 && Arrays.equals(iArr, o)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                tb1 tb1Var4 = (tb1) hashMap.get("StripOffsets");
                tb1 tb1Var5 = (tb1) hashMap.get("StripByteCounts");
                if (tb1Var4 == null || tb1Var5 == null) {
                    return;
                }
                long[] o2 = e21.o(tb1Var4.g(this.f));
                long[] o3 = e21.o(tb1Var5.g(this.f));
                if (o2 == null || o2.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (o3 == null || o3.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (o2.length != o3.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : o3) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < o2.length; i3++) {
                    int i4 = (int) o2[i3];
                    int i5 = (int) o3[i3];
                    if (i3 < o2.length - 1 && i4 + i5 != o2[i3 + 1]) {
                        this.g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        sb1Var.e(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            sb1Var.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.g) {
                    long j3 = o2[0];
                    return;
                }
                return;
            }
        }
        if (m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i2) {
        HashMap[] hashMapArr = this.d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = m;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        tb1 tb1Var = (tb1) hashMapArr[i].get("ImageLength");
        tb1 tb1Var2 = (tb1) hashMapArr[i].get("ImageWidth");
        tb1 tb1Var3 = (tb1) hashMapArr[i2].get("ImageLength");
        tb1 tb1Var4 = (tb1) hashMapArr[i2].get("ImageWidth");
        if (tb1Var == null || tb1Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (tb1Var3 == null || tb1Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e = tb1Var.e(this.f);
        int e2 = tb1Var2.e(this.f);
        int e3 = tb1Var3.e(this.f);
        int e4 = tb1Var4.e(this.f);
        if (e >= e3 || e2 >= e4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void w(wb1 wb1Var, int i) {
        tb1 c;
        tb1 c2;
        HashMap[] hashMapArr = this.d;
        tb1 tb1Var = (tb1) hashMapArr[i].get("DefaultCropSize");
        tb1 tb1Var2 = (tb1) hashMapArr[i].get("SensorTopBorder");
        tb1 tb1Var3 = (tb1) hashMapArr[i].get("SensorLeftBorder");
        tb1 tb1Var4 = (tb1) hashMapArr[i].get("SensorBottomBorder");
        tb1 tb1Var5 = (tb1) hashMapArr[i].get("SensorRightBorder");
        if (tb1Var != null) {
            int i2 = tb1Var.a;
            ByteOrder byteOrder = this.f;
            if (i2 == 5) {
                vb1[] vb1VarArr = (vb1[]) tb1Var.g(byteOrder);
                if (vb1VarArr == null || vb1VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(vb1VarArr));
                    return;
                }
                c = tb1.b(vb1VarArr[0], this.f);
                c2 = tb1.b(vb1VarArr[1], this.f);
            } else {
                int[] iArr = (int[]) tb1Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c = tb1.c(iArr[0], this.f);
                c2 = tb1.c(iArr[1], this.f);
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
            return;
        }
        if (tb1Var2 != null && tb1Var3 != null && tb1Var4 != null && tb1Var5 != null) {
            int e = tb1Var2.e(this.f);
            int e2 = tb1Var4.e(this.f);
            int e3 = tb1Var5.e(this.f);
            int e4 = tb1Var3.e(this.f);
            if (e2 <= e || e3 <= e4) {
                return;
            }
            tb1 c3 = tb1.c(e2 - e, this.f);
            tb1 c4 = tb1.c(e3 - e4, this.f);
            hashMapArr[i].put("ImageLength", c3);
            hashMapArr[i].put("ImageWidth", c4);
            return;
        }
        tb1 tb1Var6 = (tb1) hashMapArr[i].get("ImageLength");
        tb1 tb1Var7 = (tb1) hashMapArr[i].get("ImageWidth");
        if (tb1Var6 == null || tb1Var7 == null) {
            tb1 tb1Var8 = (tb1) hashMapArr[i].get("JPEGInterchangeFormat");
            tb1 tb1Var9 = (tb1) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (tb1Var8 == null || tb1Var9 == null) {
                return;
            }
            int e5 = tb1Var8.e(this.f);
            int e6 = tb1Var8.e(this.f);
            wb1Var.g(e5);
            byte[] bArr = new byte[e6];
            wb1Var.readFully(bArr);
            e(new sb1(bArr), e5, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.d;
        tb1 tb1Var = (tb1) hashMapArr[1].get("PixelXDimension");
        tb1 tb1Var2 = (tb1) hashMapArr[1].get("PixelYDimension");
        if (tb1Var != null && tb1Var2 != null) {
            hashMapArr[0].put("ImageWidth", tb1Var);
            hashMapArr[0].put("ImageLength", tb1Var2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
