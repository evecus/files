package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.media3.common.util.Log;
import coil3.Image;
import coil3.ImageLoader;
import coil3.Image_androidKt;
import coil3.decode.Decoder;
import coil3.fetch.SourceFetchResult;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.util.BitmapsKt;
import coil3.util.IntPair;
import defpackage.cz;
import defpackage.ej4;
import defpackage.er0;
import defpackage.hl1;
import defpackage.j42;
import defpackage.mw2;
import defpackage.r04;
import defpackage.s04;
import defpackage.ut4;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BitmapFactoryDecoder implements Decoder {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_MAX_PARALLELISM = 4;
    private final ExifOrientationStrategy exifOrientationStrategy;
    private final Options options;
    private final ej4 parallelismLock;
    private final ImageSource source;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ExceptionCatchingSource extends hl1 {
        private Exception exception;

        public ExceptionCatchingSource(ut4 ut4Var) {
            super(ut4Var);
        }

        public final Exception getException() {
            return this.exception;
        }

        @Override // defpackage.hl1, defpackage.ut4
        public long read(cz czVar, long j) {
            try {
                return super.read(czVar, j);
            } catch (Exception e) {
                this.exception = e;
                throw e;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BitmapFactoryDecoder(coil3.decode.ImageSource r1, coil3.request.Options r2, defpackage.ej4 r3, coil3.decode.ExifOrientationStrategy r4, int r5, defpackage.er0 r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto Le
            int r3 = defpackage.jj4.a
            ij4 r3 = new ij4
            r6 = 2147483647(0x7fffffff, float:NaN)
            r3.<init>(r6)
        Le:
            r5 = r5 & 8
            if (r5 == 0) goto L14
            coil3.decode.ExifOrientationStrategy r4 = coil3.decode.ExifOrientationStrategy.RESPECT_PERFORMANCE
        L14:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.BitmapFactoryDecoder.<init>(coil3.decode.ImageSource, coil3.request.Options, ej4, coil3.decode.ExifOrientationStrategy, int, er0):void");
    }

    private final void configureConfig(BitmapFactory.Options options, ExifData exifData) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config bitmapConfig = ImageRequests_androidKt.getBitmapConfig(this.options);
        if (exifData.isFlipped() || ExifUtilsKt.isRotated(exifData)) {
            bitmapConfig = BitmapsKt.toSoftware(bitmapConfig);
        }
        if (ImageRequests_androidKt.getAllowRgb565(this.options) && bitmapConfig == Bitmap.Config.ARGB_8888 && j42.c(options.outMimeType, "image/jpeg")) {
            bitmapConfig = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.outConfig;
            config = Bitmap.Config.RGBA_F16;
            if (config3 == config) {
                config2 = Bitmap.Config.HARDWARE;
                if (bitmapConfig != config2) {
                    bitmapConfig = config;
                }
            }
        }
        options.inPreferredConfig = bitmapConfig;
    }

    private final void configureScale(BitmapFactory.Options options, ExifData exifData) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i = ExifUtilsKt.isSwapped(exifData) ? options.outHeight : options.outWidth;
        int i2 = ExifUtilsKt.isSwapped(exifData) ? options.outWidth : options.outHeight;
        long m75computeDstSizesEdh43o = DecodeUtils.m75computeDstSizesEdh43o(i, i2, this.options.getSize(), this.options.getScale(), ImageRequestsKt.getMaxBitmapSize(this.options));
        int m125getFirstimpl = IntPair.m125getFirstimpl(m75computeDstSizesEdh43o);
        int m126getSecondimpl = IntPair.m126getSecondimpl(m75computeDstSizesEdh43o);
        int calculateInSampleSize = DecodeUtils.calculateInSampleSize(i, i2, m125getFirstimpl, m126getSecondimpl, this.options.getScale());
        options.inSampleSize = calculateInSampleSize;
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(i / calculateInSampleSize, i2 / calculateInSampleSize, m125getFirstimpl, m126getSecondimpl, this.options.getScale(), ImageRequestsKt.getMaxBitmapSize(this.options));
        if (this.options.getPrecision() == Precision.INEXACT && computeSizeMultiplier > 1.0d) {
            computeSizeMultiplier = 1.0d;
        }
        boolean z = computeSizeMultiplier == 1.0d;
        options.inScaled = !z;
        if (z) {
            return;
        }
        if (computeSizeMultiplier > 1.0d) {
            options.inDensity = mw2.O(2.147483647E9d / computeSizeMultiplier);
            options.inTargetDensity = Log.LOG_LEVEL_OFF;
        } else {
            options.inDensity = Log.LOG_LEVEL_OFF;
            options.inTargetDensity = mw2.O(2.147483647E9d * computeSizeMultiplier);
        }
    }

    private final DecodeResult decode(BitmapFactory.Options options) {
        ExceptionCatchingSource exceptionCatchingSource = new ExceptionCatchingSource(this.source.source());
        s04 s04Var = new s04(exceptionCatchingSource);
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new r04(s04Var.peek()), null, options);
        Exception exception = exceptionCatchingSource.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        ExifUtils exifUtils = ExifUtils.INSTANCE;
        ExifData exifData = exifUtils.getExifData(options.outMimeType, s04Var, this.exifOrientationStrategy);
        Exception exception2 = exceptionCatchingSource.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && ImageRequests_androidKt.getColorSpace(this.options) != null) {
            options.inPreferredColorSpace = ImageRequests_androidKt.getColorSpace(this.options);
        }
        options.inPremultiplied = ImageRequests_androidKt.getPremultipliedAlpha(this.options);
        configureConfig(options, exifData);
        configureScale(options, exifData);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(new r04(s04Var), null, options);
            s04Var.close();
            Exception exception3 = exceptionCatchingSource.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (decodeStream == null) {
                zy.i("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            decodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            Image asImage = Image_androidKt.asImage(new BitmapDrawable(this.options.getContext().getResources(), exifUtils.reverseTransformations(decodeStream, exifData)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z = false;
            }
            return new DecodeResult(asImage, z);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecodeResult decode$lambda$0$0(BitmapFactoryDecoder bitmapFactoryDecoder) {
        return bitmapFactoryDecoder.decode(new BitmapFactory.Options());
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements Decoder.Factory {
        private final ExifOrientationStrategy exifOrientationStrategy;
        private final ej4 parallelismLock;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Factory(defpackage.ej4 r1, coil3.decode.ExifOrientationStrategy r2, int r3, defpackage.er0 r4) {
            /*
                r0 = this;
                r4 = r3 & 1
                if (r4 == 0) goto Lc
                int r1 = defpackage.jj4.a
                ij4 r1 = new ij4
                r4 = 4
                r1.<init>(r4)
            Lc:
                r3 = r3 & 2
                if (r3 == 0) goto L12
                coil3.decode.ExifOrientationStrategy r2 = coil3.decode.ExifOrientationStrategy.RESPECT_PERFORMANCE
            L12:
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coil3.decode.BitmapFactoryDecoder.Factory.<init>(ej4, coil3.decode.ExifOrientationStrategy, int, er0):void");
        }

        @Override // coil3.decode.Decoder.Factory
        public Decoder create(SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader) {
            return new BitmapFactoryDecoder(sourceFetchResult.getSource(), options, this.parallelismLock, this.exifOrientationStrategy);
        }

        public Factory(ej4 ej4Var, ExifOrientationStrategy exifOrientationStrategy) {
            this.parallelismLock = ej4Var;
            this.exifOrientationStrategy = exifOrientationStrategy;
        }

        public Factory() {
            this(null, null, 3, null);
        }
    }

    public BitmapFactoryDecoder(ImageSource imageSource, Options options, ej4 ej4Var, ExifOrientationStrategy exifOrientationStrategy) {
        this.source = imageSource;
        this.options = options;
        this.parallelismLock = ej4Var;
        this.exifOrientationStrategy = exifOrientationStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.hj4) r8).a(r0) == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // coil3.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object decode(defpackage.fj0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = (coil3.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = new coil3.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L40
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            ej4 r7 = (defpackage.ej4) r7
            defpackage.mu0.V(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6e
        L2f:
            r8 = move-exception
            goto L7c
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r2
        L37:
            java.lang.Object r1 = r0.L$0
            ej4 r1 = (defpackage.ej4) r1
            defpackage.mu0.V(r8)
            r8 = r1
            goto L53
        L40:
            defpackage.mu0.V(r8)
            ej4 r8 = r7.parallelismLock
            r0.L$0 = r8
            r0.label = r4
            r1 = r8
            hj4 r1 = (defpackage.hj4) r1
            java.lang.Object r1 = r1.a(r0)
            if (r1 != r5) goto L53
            goto L6a
        L53:
            eq r1 = new eq     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r7, r4)     // Catch: java.lang.Throwable -> L7a
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L7a
            r0.label = r3     // Catch: java.lang.Throwable -> L7a
            l91 r7 = defpackage.l91.I     // Catch: java.lang.Throwable -> L7a
            u32 r3 = new u32     // Catch: java.lang.Throwable -> L7a
            r4 = 0
            r3.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r7 = defpackage.p70.D0(r7, r3, r0)     // Catch: java.lang.Throwable -> L7a
            if (r7 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r8
            r8 = r7
            r7 = r6
        L6e:
            coil3.decode.DecodeResult r8 = (coil3.decode.DecodeResult) r8     // Catch: java.lang.Throwable -> L2f
            hj4 r7 = (defpackage.hj4) r7
            r7.c()
            return r8
        L76:
            r6 = r8
            r8 = r7
            r7 = r6
            goto L7c
        L7a:
            r7 = move-exception
            goto L76
        L7c:
            hj4 r7 = (defpackage.hj4) r7
            r7.c()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.BitmapFactoryDecoder.decode(fj0):java.lang.Object");
    }
}
