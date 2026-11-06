package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mt {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public final tl1 p;
    public int q;

    public mt(tl1 tl1Var) {
        ll1 ll1Var = tl1Var.r;
        if (ll1Var != null) {
            ll1Var.I.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.q = -1;
        this.p = tl1Var;
    }

    public final void a(int i) {
        if (this.g) {
            if (tl1.h(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((yl1) arrayList.get(i2)).getClass();
            }
        }
    }

    public final void b(String str, PrintWriter printWriter) {
        c(str, printWriter, true);
    }

    public final void c(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.q);
            printWriter.print(" mCommitted=");
            printWriter.println(false);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yl1 yl1Var = (yl1) arrayList.get(i);
            switch (yl1Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + yl1Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println((Object) null);
            if (z) {
                if (yl1Var.c != 0 || yl1Var.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(yl1Var.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(yl1Var.d));
                }
                if (yl1Var.e != 0 || yl1Var.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(yl1Var.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(yl1Var.f));
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yl1 yl1Var = (yl1) arrayList.get(i);
            yl1Var.getClass();
            switch (yl1Var.a) {
                case 1:
                    throw null;
                case 2:
                default:
                    hn3.g(yl1Var.a, "Unknown cmd: ");
                    return;
                case 3:
                    throw null;
                case 4:
                    throw null;
                case 5:
                    throw null;
                case 6:
                    throw null;
                case 7:
                    throw null;
                case 8:
                case 9:
                case 10:
                    throw null;
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            yl1 yl1Var = (yl1) arrayList.get(size);
            yl1Var.getClass();
            switch (yl1Var.a) {
                case 1:
                    throw null;
                case 2:
                default:
                    hn3.g(yl1Var.a, "Unknown cmd: ");
                    return;
                case 3:
                    throw null;
                case 4:
                    throw null;
                case 5:
                    throw null;
                case 6:
                    throw null;
                case 7:
                    throw null;
                case 8:
                case 9:
                case 10:
                    throw null;
            }
        }
    }

    public final void f(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.a;
            if (i >= arrayList2.size()) {
                return;
            }
            yl1 yl1Var = (yl1) arrayList2.get(i);
            int i2 = yl1Var.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    throw null;
                }
                ki2 ki2Var = ki2.M;
                if (i2 == 3 || i2 == 6) {
                    arrayList.remove((Object) null);
                    yl1 yl1Var2 = new yl1();
                    yl1Var2.a = 9;
                    yl1Var2.b = false;
                    yl1Var2.g = ki2Var;
                    yl1Var2.h = ki2Var;
                    arrayList2.add(i, yl1Var2);
                } else if (i2 != 7) {
                    if (i2 != 8) {
                        i++;
                    } else {
                        yl1 yl1Var3 = new yl1();
                        yl1Var3.a = 9;
                        yl1Var3.b = true;
                        yl1Var3.g = ki2Var;
                        yl1Var3.h = ki2Var;
                        arrayList2.add(i, yl1Var3);
                        yl1Var.b = true;
                    }
                }
                i++;
                i++;
            }
            arrayList.add(null);
            i++;
        }
    }

    public final void g(ArrayList arrayList, ArrayList arrayList2) {
        if (tl1.h(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.g) {
            tl1 tl1Var = this.p;
            ArrayList arrayList3 = tl1Var.d;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                tl1Var.d = arrayList3;
            }
            arrayList3.add(this);
        }
    }

    public final void h(ArrayList arrayList) {
        ArrayList arrayList2 = this.a;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            yl1 yl1Var = (yl1) arrayList2.get(size);
            int i = yl1Var.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 10:
                            yl1Var.h = yl1Var.g;
                            break;
                    }
                }
                arrayList.add(null);
            }
            arrayList.remove((Object) null);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.q >= 0) {
            sb.append(" #");
            sb.append(this.q);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
