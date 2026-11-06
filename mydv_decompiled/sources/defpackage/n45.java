package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n45 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public byte J;
    public final /* synthetic */ u45 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n45(u45 u45Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = u45Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        u45 u45Var = this.K;
        switch (b) {
            case 0:
                n45 n45Var = new n45(u45Var, fj0Var, (byte) 0);
                long j = ((pd3) obj).a;
                return n45Var;
            default:
                return new n45(u45Var, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                long j = ((pd3) obj).a;
                return new n45(this.K, (fj0) obj2, (byte) 0).invokeSuspend(wd5Var);
            default:
                return ((n45) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object u60Var;
        Object obj2;
        CharSequence text;
        int i;
        Spanned spanned;
        int i2;
        oj ojVar;
        byte b = this.I;
        el0 el0Var = el0.I;
        u45 u45Var = this.K;
        wd5 wd5Var = wd5.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                byte b3 = this.J;
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            mu0.V(obj);
                            break;
                        } else {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        mu0.V(obj);
                    }
                } else {
                    mu0.V(obj);
                    this.J = (byte) 1;
                    if (u45Var.t(this) == el0Var) {
                    }
                }
                uj3 f = u45Var.f();
                if (f != null) {
                    String str = (String) f.I;
                    long j = ((d65) f.J).a;
                    wn3 wn3Var = u45Var.i;
                    if (wn3Var != null) {
                        this.J = (byte) 2;
                        co3 co3Var = (co3) wn3Var;
                        Object D0 = (str.length() == 0 || d65.c(j)) ? wd5Var : p70.D0(co3Var.a, new ao3(co3Var, new zn3(j, null, co3Var, str), null), this);
                        if (D0 != el0Var) {
                            D0 = wd5Var;
                        }
                        if (D0 == el0Var) {
                        }
                    }
                }
                break;
            default:
                byte b4 = this.J;
                if (b4 != 0) {
                    if (b4 != 1) {
                        if (b4 == 2) {
                            mu0.V(obj);
                            obj2 = obj;
                            ojVar = (oj) obj2;
                            if (ojVar != null && u45Var.h()) {
                                mj mjVar = new mj(fb4.s(u45Var.l(), u45Var.l().a.J.length()));
                                mjVar.a(ojVar);
                                oj f2 = mjVar.f();
                                oj r = fb4.r(u45Var.l(), u45Var.l().a.J.length());
                                mj mjVar2 = new mj(f2);
                                mjVar2.a(r);
                                oj f3 = mjVar2.f();
                                int length = ojVar.J.length() + d65.f(u45Var.l().b);
                                u45Var.c.invoke(u45.b(f3, ui4.c(length, length)));
                                u45Var.r(ks1.I);
                                u45Var.a.e = true;
                            }
                            break;
                        } else {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        mu0.V(obj);
                        u60Var = obj;
                    }
                } else {
                    mu0.V(obj);
                    v60 v60Var = u45Var.g;
                    if (v60Var != null) {
                        this.J = (byte) 1;
                        ClipData primaryClip = ((ca) v60Var).a.l().getPrimaryClip();
                        u60Var = primaryClip != null ? new u60(primaryClip) : null;
                        if (u60Var == el0Var) {
                        }
                    }
                }
                u60 u60Var2 = (u60) u60Var;
                if (u60Var2 != null) {
                    this.J = (byte) 2;
                    int i3 = 0;
                    ClipData.Item itemAt = u60Var2.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        obj2 = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i4 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i4];
                                if (j42.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel obtain = Parcel.obtain();
                                    byte[] decode = Base64.decode(value, i3);
                                    obtain.unmarshall(decode, i3, decode.length);
                                    obtain.setDataPosition(i3);
                                    long j2 = x70.g;
                                    long j3 = j2;
                                    long j4 = p65.c;
                                    long j5 = j4;
                                    qk1 qk1Var = null;
                                    lk1 lk1Var = null;
                                    mk1 mk1Var = null;
                                    String str2 = null;
                                    wu wuVar = null;
                                    h55 h55Var = null;
                                    m35 m35Var = null;
                                    an4 an4Var = null;
                                    while (obtain.dataAvail() > b2) {
                                        byte readByte = obtain.readByte();
                                        if (readByte != b2) {
                                            i = i3;
                                            spanned = spanned2;
                                            if (readByte == 2) {
                                                if (obtain.dataAvail() >= 5) {
                                                    byte readByte2 = obtain.readByte();
                                                    long j6 = readByte2 == b2 ? 4294967296L : readByte2 == 2 ? 8589934592L : 0L;
                                                    j4 = q65.a(j6, 0L) ? p65.c : oh4.p(j6, obtain.readFloat());
                                                    i3 = i;
                                                    spanned2 = spanned;
                                                    b2 = 1;
                                                } else {
                                                    arrayList.add(new nj(spanStart, spanEnd, new yt4(j2, j4, qk1Var, lk1Var, mk1Var, null, str2, j5, wuVar, h55Var, null, j3, m35Var, an4Var, 49152)));
                                                }
                                            } else if (readByte == 3) {
                                                if (obtain.dataAvail() >= 4) {
                                                    spanned2 = spanned;
                                                    qk1Var = new qk1(obtain.readInt());
                                                    b2 = 1;
                                                    i3 = i;
                                                } else {
                                                    arrayList.add(new nj(spanStart, spanEnd, new yt4(j2, j4, qk1Var, lk1Var, mk1Var, null, str2, j5, wuVar, h55Var, null, j3, m35Var, an4Var, 49152)));
                                                }
                                            } else if (readByte == 4) {
                                                b2 = 1;
                                                if (obtain.dataAvail() >= 1) {
                                                    byte readByte3 = obtain.readByte();
                                                    lk1 lk1Var2 = new lk1((readByte3 != 0 && readByte3 == 1) ? 1 : i);
                                                    i3 = i;
                                                    lk1Var = lk1Var2;
                                                    spanned2 = spanned;
                                                } else {
                                                    arrayList.add(new nj(spanStart, spanEnd, new yt4(j2, j4, qk1Var, lk1Var, mk1Var, null, str2, j5, wuVar, h55Var, null, j3, m35Var, an4Var, 49152)));
                                                }
                                            } else if (readByte != 5) {
                                                if (readByte == 6) {
                                                    str2 = obtain.readString();
                                                } else if (readByte != 7) {
                                                    if (readByte == 8) {
                                                        if (obtain.dataAvail() >= 4) {
                                                            i3 = i;
                                                            wuVar = new wu(obtain.readFloat());
                                                            b2 = 1;
                                                            spanned2 = spanned;
                                                        }
                                                    } else if (readByte == 9) {
                                                        if (obtain.dataAvail() >= 8) {
                                                            spanned2 = spanned;
                                                            h55Var = new h55(obtain.readFloat(), obtain.readFloat());
                                                            b2 = 1;
                                                            i3 = i;
                                                        }
                                                    } else if (readByte == 10) {
                                                        if (obtain.dataAvail() >= 8) {
                                                            int i5 = x70.h;
                                                            long readLong = obtain.readLong();
                                                            long j7 = readLong & 63;
                                                            if (j7 >= 16) {
                                                                readLong = (readLong & (-64)) | (j7 + 1);
                                                            }
                                                            j3 = readLong;
                                                        }
                                                    } else if (readByte == 11) {
                                                        if (obtain.dataAvail() >= 4) {
                                                            int readInt = obtain.readInt();
                                                            int i6 = (readInt & 2) != 0 ? 1 : i;
                                                            int i7 = (readInt & 1) != 0 ? 1 : i;
                                                            m35 m35Var2 = m35.d;
                                                            m35 m35Var3 = m35.c;
                                                            if (i6 != 0 && i7 != 0) {
                                                                m35[] m35VarArr = new m35[2];
                                                                m35VarArr[i] = m35Var2;
                                                                m35VarArr[1] = m35Var3;
                                                                List k0 = p70.k0(m35VarArr);
                                                                Integer valueOf = Integer.valueOf(i);
                                                                int size = k0.size();
                                                                for (int i8 = i; i8 < size; i8++) {
                                                                    valueOf = Integer.valueOf(valueOf.intValue() | ((m35) k0.get(i8)).a);
                                                                }
                                                                m35Var2 = new m35(valueOf.intValue());
                                                            } else if (i6 == 0) {
                                                                m35Var = i7 != 0 ? m35Var3 : m35.b;
                                                            }
                                                            m35Var = m35Var2;
                                                        }
                                                    } else if (readByte == 12) {
                                                        if (obtain.dataAvail() >= 20) {
                                                            int i9 = x70.h;
                                                            long readLong2 = obtain.readLong();
                                                            long j8 = readLong2 & 63;
                                                            if (j8 >= 16) {
                                                                readLong2 = (readLong2 & (-64)) | (j8 + 1);
                                                            }
                                                            i3 = i;
                                                            spanned2 = spanned;
                                                            an4Var = new an4(readLong2, (Float.floatToRawIntBits(obtain.readFloat()) << 32) | (Float.floatToRawIntBits(obtain.readFloat()) & 4294967295L), obtain.readFloat());
                                                            b2 = 1;
                                                        }
                                                    }
                                                    arrayList.add(new nj(spanStart, spanEnd, new yt4(j2, j4, qk1Var, lk1Var, mk1Var, null, str2, j5, wuVar, h55Var, null, j3, m35Var, an4Var, 49152)));
                                                } else if (obtain.dataAvail() >= 5) {
                                                    byte readByte4 = obtain.readByte();
                                                    long j9 = readByte4 == 1 ? 4294967296L : readByte4 == 2 ? 8589934592L : 0L;
                                                    j5 = q65.a(j9, 0L) ? p65.c : oh4.p(j9, obtain.readFloat());
                                                } else {
                                                    arrayList.add(new nj(spanStart, spanEnd, new yt4(j2, j4, qk1Var, lk1Var, mk1Var, null, str2, j5, wuVar, h55Var, null, j3, m35Var, an4Var, 49152)));
                                                }
                                                i3 = i;
                                                spanned2 = spanned;
                                                b2 = 1;
                                            } else if (obtain.dataAvail() >= 1) {
                                                byte readByte5 = obtain.readByte();
                                                if (readByte5 != 0) {
                                                    if (readByte5 == 1) {
                                                        i2 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                                    } else if (readByte5 == 3) {
                                                        i2 = 2;
                                                    } else if (readByte5 == 2) {
                                                        i2 = 1;
                                                    }
                                                    mk1 mk1Var2 = new mk1(i2);
                                                    i3 = i;
                                                    mk1Var = mk1Var2;
                                                    b2 = 1;
                                                    spanned2 = spanned;
                                                }
                                                i2 = i;
                                                mk1 mk1Var22 = new mk1(i2);
                                                i3 = i;
                                                mk1Var = mk1Var22;
                                                b2 = 1;
                                                spanned2 = spanned;
                                            } else {
                                                arrayList.add(new nj(spanStart, spanEnd, new yt4(j2, j4, qk1Var, lk1Var, mk1Var, null, str2, j5, wuVar, h55Var, null, j3, m35Var, an4Var, 49152)));
                                            }
                                        } else if (obtain.dataAvail() >= 8) {
                                            int i10 = x70.h;
                                            long readLong3 = obtain.readLong();
                                            long j10 = readLong3 & 63;
                                            j2 = j10 < 16 ? readLong3 : (readLong3 & (-64)) | (j10 + 1);
                                        } else {
                                            i = i3;
                                            spanned = spanned2;
                                            arrayList.add(new nj(spanStart, spanEnd, new yt4(j2, j4, qk1Var, lk1Var, mk1Var, null, str2, j5, wuVar, h55Var, null, j3, m35Var, an4Var, 49152)));
                                        }
                                    }
                                    i = i3;
                                    spanned = spanned2;
                                    arrayList.add(new nj(spanStart, spanEnd, new yt4(j2, j4, qk1Var, lk1Var, mk1Var, null, str2, j5, wuVar, h55Var, null, j3, m35Var, an4Var, 49152)));
                                } else {
                                    i = i3;
                                    spanned = spanned2;
                                }
                                if (i4 != length2) {
                                    i4++;
                                    i3 = i;
                                    spanned2 = spanned;
                                    b2 = 1;
                                }
                            }
                        }
                        String obj3 = text.toString();
                        oj ojVar2 = pj.a;
                        obj2 = new oj(arrayList.isEmpty() ? null : arrayList, obj3);
                    } else {
                        obj2 = new oj(text.toString());
                    }
                    if (obj2 == el0Var) {
                    }
                    ojVar = (oj) obj2;
                    if (ojVar != null) {
                        mj mjVar3 = new mj(fb4.s(u45Var.l(), u45Var.l().a.J.length()));
                        mjVar3.a(ojVar);
                        oj f22 = mjVar3.f();
                        oj r2 = fb4.r(u45Var.l(), u45Var.l().a.J.length());
                        mj mjVar22 = new mj(f22);
                        mjVar22.a(r2);
                        oj f32 = mjVar22.f();
                        int length3 = ojVar.J.length() + d65.f(u45Var.l().b);
                        u45Var.c.invoke(u45.b(f32, ui4.c(length3, length3)));
                        u45Var.r(ks1.I);
                        u45Var.a.e = true;
                    }
                }
                break;
        }
        return wd5Var;
    }
}
