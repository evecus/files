package coil3.decode;

import coil3.ColorImage;
import coil3.Image;
import coil3.ImageLoader;
import coil3.decode.Decoder;
import coil3.fetch.SourceFetchResult;
import coil3.request.Options;
import defpackage.er0;
import defpackage.fj0;
import defpackage.rm1;
import defpackage.u7;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class BlackholeDecoder implements Decoder {
    private final rm1 imageFactory;

    public BlackholeDecoder(rm1 rm1Var) {
        this.imageFactory = rm1Var;
    }

    @Override // coil3.decode.Decoder
    public Object decode(fj0 fj0Var) {
        return new DecodeResult((Image) this.imageFactory.invoke(), false);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Factory implements Decoder.Factory {
        public static final Companion Companion = new Companion(null);
        public static final Image EMPTY_IMAGE = new ColorImage(0, 0, 0, 0, false, 30, null);
        private final rm1 imageFactory;

        public /* synthetic */ Factory(rm1 rm1Var, int i, er0 er0Var) {
            this((i & 1) != 0 ? new u7((byte) 7) : rm1Var);
        }

        @Override // coil3.decode.Decoder.Factory
        public BlackholeDecoder create(SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader) {
            return new BlackholeDecoder(this.imageFactory);
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Companion {
            public /* synthetic */ Companion(er0 er0Var) {
                this();
            }

            private Companion() {
            }
        }

        public Factory(rm1 rm1Var) {
            this.imageFactory = rm1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
