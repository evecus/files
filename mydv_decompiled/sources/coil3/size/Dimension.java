package coil3.size;

import defpackage.r7;
import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface Dimension {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Undefined implements Dimension {
        public static final Undefined INSTANCE = new Undefined();

        private Undefined() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Undefined);
        }

        public int hashCode() {
            return -2093724603;
        }

        public String toString() {
            return "Undefined";
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Pixels implements Dimension {
        private final int px;

        private /* synthetic */ Pixels(int i) {
            this.px = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Pixels m110boximpl(int i) {
            return new Pixels(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m111constructorimpl(int i) {
            if (i > 0) {
                return i;
            }
            s83.t("px must be > 0.");
            return 0;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m112equalsimpl(int i, Object obj) {
            return (obj instanceof Pixels) && i == ((Pixels) obj).m116unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m113equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m115toStringimpl(int i) {
            return r7.z("Pixels(px=", i, ")");
        }

        public boolean equals(Object obj) {
            return m112equalsimpl(this.px, obj);
        }

        public final int getPx() {
            return this.px;
        }

        public int hashCode() {
            return m114hashCodeimpl(this.px);
        }

        public String toString() {
            return m115toStringimpl(this.px);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m116unboximpl() {
            return this.px;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m114hashCodeimpl(int i) {
            return i;
        }
    }
}
