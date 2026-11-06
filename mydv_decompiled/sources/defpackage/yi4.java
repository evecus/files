package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class yi4 implements hn1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ yi4(byte b) {
        this.I = b;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        switch (this.I) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 1:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 4:
                return (t64) obj;
            case 5:
                return (String) obj;
            case 6:
                return (wd5) obj;
            case 7:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                return arrayList2;
            case 8:
                return (dn4) obj;
            case 9:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 10:
                return (ui0) obj;
            case 11:
                return (xb) obj;
            case 12:
                return (pe1) obj;
            case 13:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 14:
                r7.K(obj);
                r7.K(obj2);
                return null;
            case 15:
                return obj == null ? obj2 : obj;
            case 16:
                rk0 rk0Var = (rk0) obj2;
                if (!(rk0Var instanceof v65)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? rk0Var : Integer.valueOf(intValue + 1);
            case 17:
                v65 v65Var = (v65) obj;
                rk0 rk0Var2 = (rk0) obj2;
                if (v65Var != null) {
                    return v65Var;
                }
                if (rk0Var2 instanceof v65) {
                    return (v65) rk0Var2;
                }
                return null;
            case 18:
                b75 b75Var = (b75) obj;
                rk0 rk0Var3 = (rk0) obj2;
                if (rk0Var3 instanceof v65) {
                    v65 v65Var2 = (v65) rk0Var3;
                    tk0 tk0Var = b75Var.a;
                    b75Var.a(v65Var2, v65Var2.F());
                }
                return b75Var;
            default:
                q8.e0.invoke(obj);
                return wd5.a;
        }
    }
}
