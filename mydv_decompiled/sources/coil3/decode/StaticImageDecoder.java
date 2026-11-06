package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import coil3.ImageLoader;
import coil3.decode.Decoder;
import coil3.decode.StaticImageDecoder;
import coil3.fetch.SourceFetchResult;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.util.BitmapsKt;
import defpackage.ej4;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class StaticImageDecoder implements Decoder {
    private final AutoCloseable closeable;
    private final Options options;
    private final ej4 parallelismLock;
    private final ImageDecoder.Source source;

    public StaticImageDecoder(ImageDecoder.Source source, AutoCloseable autoCloseable, Options options, ej4 ej4Var) {
        this.source = source;
        this.closeable = autoCloseable;
        this.options = options;
        this.parallelismLock = ej4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureImageDecoderProperties(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: nw4
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                boolean configureImageDecoderProperties$lambda$0;
                configureImageDecoderProperties$lambda$0 = StaticImageDecoder.configureImageDecoderProperties$lambda$0(StaticImageDecoder.this, decodeException);
                return configureImageDecoderProperties$lambda$0;
            }
        });
        imageDecoder.setAllocator(BitmapsKt.isHardware(ImageRequests_androidKt.getBitmapConfig(this.options)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!ImageRequests_androidKt.getAllowRgb565(this.options) ? 1 : 0);
        if (ImageRequests_androidKt.getColorSpace(this.options) != null) {
            imageDecoder.setTargetColorSpace(ImageRequests_androidKt.getColorSpace(this.options));
        }
        imageDecoder.setUnpremultipliedRequired(!ImageRequests_androidKt.getPremultipliedAlpha(this.options));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configureImageDecoderProperties$lambda$0(StaticImageDecoder staticImageDecoder, ImageDecoder.DecodeException decodeException) {
        return ImageRequests_androidKt.getAllowPartialImage(staticImageDecoder.options);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // coil3.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object decode(defpackage.fj0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil3.decode.StaticImageDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.decode.StaticImageDecoder$decode$1 r0 = (coil3.decode.StaticImageDecoder$decode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.decode.StaticImageDecoder$decode$1 r0 = new coil3.decode.StaticImageDecoder$decode$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r0 = r0.L$0
            ej4 r0 = (defpackage.ej4) r0
            defpackage.mu0.V(r7)
            goto L46
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r2
        L30:
            defpackage.mu0.V(r7)
            ej4 r7 = r6.parallelismLock
            r0.L$0 = r7
            r0.label = r3
            r1 = r7
            hj4 r1 = (defpackage.hj4) r1
            java.lang.Object r0 = r1.a(r0)
            el0 r1 = defpackage.el0.I
            if (r0 != r1) goto L45
            return r1
        L45:
            r0 = r7
        L46:
            java.lang.AutoCloseable r7 = r6.closeable     // Catch: java.lang.Throwable -> L6d
            n24 r1 = new n24     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            android.graphics.ImageDecoder$Source r4 = r6.source     // Catch: java.lang.Throwable -> L6f
            coil3.decode.StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1 r5 = new coil3.decode.StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1     // Catch: java.lang.Throwable -> L6f
            r5.<init>()     // Catch: java.lang.Throwable -> L6f
            android.graphics.Bitmap r6 = android.graphics.ImageDecoder.decodeBitmap(r4, r5)     // Catch: java.lang.Throwable -> L6f
            coil3.decode.DecodeResult r4 = new coil3.decode.DecodeResult     // Catch: java.lang.Throwable -> L6f
            r5 = 0
            coil3.BitmapImage r6 = coil3.Image_androidKt.asImage$default(r6, r5, r3, r2)     // Catch: java.lang.Throwable -> L6f
            boolean r1 = r1.I     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r6, r1)     // Catch: java.lang.Throwable -> L6f
            defpackage.mw2.v(r7, r2)     // Catch: java.lang.Throwable -> L6d
            hj4 r0 = (defpackage.hj4) r0
            r0.c()
            return r4
        L6d:
            r6 = move-exception
            goto L76
        L6f:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L71
        L71:
            r1 = move-exception
            defpackage.mw2.v(r7, r6)     // Catch: java.lang.Throwable -> L6d
            throw r1     // Catch: java.lang.Throwable -> L6d
        L76:
            hj4 r0 = (defpackage.hj4) r0
            r0.c()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.StaticImageDecoder.decode(fj0):java.lang.Object");
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements Decoder.Factory {
        private final ej4 parallelismLock;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Factory(defpackage.ej4 r1, int r2, defpackage.er0 r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto Lc
                int r1 = defpackage.jj4.a
                ij4 r1 = new ij4
                r2 = 4
                r1.<init>(r2)
            Lc:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coil3.decode.StaticImageDecoder.Factory.<init>(ej4, int, er0):void");
        }

        private final boolean isApplicable(Options options) {
            Bitmap.Config config;
            Bitmap.Config bitmapConfig = ImageRequests_androidKt.getBitmapConfig(options);
            if (bitmapConfig == Bitmap.Config.ARGB_8888) {
                return true;
            }
            config = Bitmap.Config.HARDWARE;
            return bitmapConfig == config;
        }

        @Override // coil3.decode.Decoder.Factory
        public Decoder create(SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader) {
            ImageDecoder.Source imageDecoderSourceOrNull;
            if (isApplicable(options) && (imageDecoderSourceOrNull = StaticImageDecoderKt.toImageDecoderSourceOrNull(sourceFetchResult.getSource(), options, false)) != null) {
                return new StaticImageDecoder(imageDecoderSourceOrNull, sourceFetchResult.getSource(), options, this.parallelismLock);
            }
            return null;
        }

        public Factory(ej4 ej4Var) {
            this.parallelismLock = ej4Var;
        }

        public Factory() {
            this(null, 1, null);
        }
    }
}
