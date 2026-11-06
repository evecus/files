package defpackage;

import androidx.media3.common.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v30 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;

    public /* synthetic */ v30(byte b, tm1 tm1Var, List list) {
        this.I = b;
        this.J = list;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        List list = this.J;
        switch (b) {
            case 0:
                return "section";
            case 1:
                return "section";
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 4:
                String str = (String) list.get(((Number) obj).intValue());
                str.getClass();
                return str;
            case 5:
                return "nav";
            case 6:
                return "room";
            case 7:
                return "partition";
            case 8:
                return "partition";
            case 9:
                return "episode";
            case 10:
                return "account";
            case 11:
                return "mix";
            case 12:
                return "user";
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                return "history";
            case 15:
                return "hot";
            case 16:
                return "result";
            case 17:
                return hf1.u(((List) list.get(((Number) obj).intValue())).size(), "row:");
            case 18:
                list.get(((Number) obj).intValue());
                return null;
            case 19:
                list.get(((Number) obj).intValue());
                return null;
            case 20:
                String str2 = (String) list.get(((Number) obj).intValue());
                str2.getClass();
                return str2;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ v30(List list, byte b) {
        this.I = b;
        this.J = list;
    }
}
