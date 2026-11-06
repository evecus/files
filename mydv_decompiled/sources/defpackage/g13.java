package defpackage;

import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Avatar;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.BitRate;
import com.github.mytv.dv.model.Cover;
import com.github.mytv.dv.model.FeedResponse;
import com.github.mytv.dv.model.MixInfo;
import com.github.mytv.dv.model.PlayAddr;
import com.github.mytv.dv.model.PlayProgress;
import com.github.mytv.dv.model.Statistics;
import com.github.mytv.dv.model.Video;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class g13 {
    public static final Charset a = z50.a;
    public static final String[] b = {"http://", "https://"};
    public static final String c = "MS4wLjABAAAA";
    public static final Set d = dq.p1(new Integer[]{Integer.valueOf(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS), Integer.valueOf(HttpStatusCodesKt.HTTP_PROCESSING)});

    public static List a(cp0 cp0Var, int i) {
        ArrayList m = cp0Var.m(2);
        ArrayList arrayList = new ArrayList();
        int size = m.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = m.get(i3);
            i3++;
            if (d((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return o70.P0(arrayList);
        }
        if (i >= 2) {
            ArrayList b2 = cp0Var.b();
            ArrayList arrayList2 = new ArrayList();
            int size2 = b2.size();
            while (i2 < size2) {
                Object obj2 = b2.get(i2);
                i2++;
                if (d((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            return o70.P0(arrayList2);
        }
        ArrayList P = p70.P(cp0Var.a.values());
        ArrayList arrayList3 = new ArrayList();
        int size3 = P.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = P.get(i4);
            i4++;
            f13 f13Var = (f13) obj3;
            d13 d13Var = f13Var instanceof d13 ? (d13) f13Var : null;
            byte[] bArr = d13Var != null ? d13Var.a : null;
            if (bArr != null) {
                arrayList3.add(bArr);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList3.get(i5);
            i5++;
            u70.I0(arrayList4, a(h((byte[]) obj4), i + 1));
        }
        if (!arrayList4.isEmpty()) {
            return o70.P0(arrayList4);
        }
        ArrayList b3 = cp0Var.b();
        ArrayList arrayList5 = new ArrayList();
        int size5 = b3.size();
        while (i2 < size5) {
            Object obj5 = b3.get(i2);
            i2++;
            if (d((String) obj5)) {
                arrayList5.add(obj5);
            }
        }
        return o70.P0(arrayList5);
    }

    public static String b(cp0 cp0Var) {
        Object obj;
        ArrayList m = cp0Var.m(1);
        int size = m.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = m.get(i);
            i++;
            if (!jx4.L((String) obj)) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        Long g = cp0Var.g(1);
        if (g == null) {
            return "";
        }
        Long l = g.longValue() > 0 ? g : null;
        return l != null ? String.valueOf(l.longValue()) : "";
    }

    public static boolean c(String str) {
        int length = str.length();
        if (6 <= length && length < 26) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str) {
        for (String str2 : b) {
            if (qx4.y(str, str2, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.github.mytv.dv.model.Statistics] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    public static Aweme e(int i, byte[] bArr) {
        String str;
        String str2;
        Author author;
        Aweme aweme;
        byte b2;
        Video video;
        Object obj;
        Object obj2;
        PlayAddr playAddr;
        int i2;
        Cover cover;
        Integer num;
        Integer num2;
        Object obj3;
        bArr.getClass();
        List list = null;
        int i3 = 2;
        if (i > 2) {
            return null;
        }
        cp0 h = h(bArr);
        String b3 = b(h);
        String l = h.l(2);
        if (l.length() > 0 && c(l) && b3.length() == 0) {
            str = l;
            str2 = "";
        } else {
            str = b3;
            str2 = l;
        }
        long f = h.f(3);
        Iterator it = o70.f1(h.d(4), h.d(5)).iterator();
        byte b4 = 0;
        byte b5 = 1;
        if (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            bArr2.getClass();
            cp0 h2 = h(bArr2);
            String b6 = b(h2);
            String l2 = h2.l(3);
            if (jx4.L(l2)) {
                l2 = h2.l(2);
            }
            String str3 = l2;
            String l3 = h2.l(4);
            Iterator it2 = h2.d(5).iterator();
            Avatar avatar = it2.hasNext() ? new Avatar(a(h((byte[]) it2.next()), 0)) : null;
            if (avatar == null) {
                avatar = new Avatar(list, (int) b5, (er0) (false ? 1 : 0));
            }
            Avatar avatar2 = avatar;
            Iterator it3 = h2.d(6).iterator();
            Avatar avatar3 = it3.hasNext() ? new Avatar(a(h((byte[]) it3.next()), 0)) : null;
            if (avatar3 == null) {
                avatar3 = new Avatar((List) (false ? 1 : 0), (int) b5, (er0) (false ? 1 : 0));
            }
            Avatar avatar4 = avatar3;
            Iterator it4 = h2.d(7).iterator();
            Avatar avatar5 = it4.hasNext() ? new Avatar(a(h((byte[]) it4.next()), 0)) : null;
            if (avatar5 == null) {
                avatar5 = new Avatar((List) (false ? 1 : 0), (int) b5, (er0) (false ? 1 : 0));
            }
            Avatar avatar6 = avatar5;
            ArrayList b7 = h2.b();
            int size = b7.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj3 = null;
                    break;
                }
                obj3 = b7.get(i4);
                i4++;
                if (qx4.y((String) obj3, c, false)) {
                    break;
                }
            }
            String str4 = (String) obj3;
            author = new Author(b6, str3, avatar4, avatar6, avatar2, str4 == null ? "" : str4, l3, 0L, 0L, 0L, 0L, 0L, 3968, (er0) null);
        } else {
            author = null;
        }
        if (author == null) {
            author = new Author((String) null, (String) null, (Avatar) null, (Avatar) null, (Avatar) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 4095, (er0) null);
        }
        Iterator it5 = o70.f1(h.d(7), h.d(8)).iterator();
        if (it5.hasNext()) {
            byte[] bArr3 = (byte[]) it5.next();
            bArr3.getClass();
            cp0 h3 = h(bArr3);
            ArrayList f1 = o70.f1(h3.d(1), h3.d(9));
            int size2 = f1.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    playAddr = null;
                    break;
                }
                Object obj4 = f1.get(i5);
                i5++;
                playAddr = g((byte[]) obj4);
                if (playAddr.getUrlList().isEmpty()) {
                    playAddr = null;
                }
                if (playAddr != null) {
                    break;
                }
            }
            if (playAddr == null) {
                playAddr = new PlayAddr((List) null, (String) null, 0, 0, 0L, 31, (er0) null);
            }
            ArrayList f12 = o70.f1(h3.d(2), h3.d(10));
            int size3 = f12.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    i2 = i3;
                    cover = null;
                    break;
                }
                Object obj5 = f12.get(i6);
                i6++;
                i2 = i3;
                cover = new Cover(a(h((byte[]) obj5), 0));
                if (cover.getUrlList().isEmpty()) {
                    cover = null;
                }
                if (cover != null) {
                    break;
                }
                i3 = i2;
            }
            if (cover == null) {
                cover = new Cover((List) (false ? 1 : 0), (int) b5, (er0) (false ? 1 : 0));
            }
            Cover cover2 = cover;
            int f2 = (int) h3.f(3);
            int f3 = (int) h3.f(4);
            Iterator it6 = h3.d(5).iterator();
            Cover cover3 = it6.hasNext() ? new Cover(a(h((byte[]) it6.next()), 0)) : null;
            if (cover3 == null) {
                cover3 = new Cover((List) (false ? 1 : 0), (int) b5, (er0) (false ? 1 : 0));
            }
            Cover cover4 = cover3;
            Iterator it7 = h3.d(6).iterator();
            Cover cover5 = it7.hasNext() ? new Cover(a(h((byte[]) it7.next()), 0)) : null;
            if (cover5 == null) {
                cover5 = new Cover((List) (false ? 1 : 0), (int) b5, (er0) (false ? 1 : 0));
            }
            Cover cover6 = cover5;
            String l4 = h3.l(7);
            Iterator it8 = h3.d(8).iterator();
            PlayAddr g = it8.hasNext() ? g((byte[]) it8.next()) : null;
            PlayAddr playAddr2 = g == null ? new PlayAddr((List) null, (String) null, 0, 0, 0L, 31, (er0) null) : g;
            aweme = null;
            Integer[] numArr = new Integer[3];
            numArr[0] = 12;
            numArr[1] = 22;
            numArr[i2] = 32;
            v2 v2Var = new v2(numArr, (byte) 1);
            while (true) {
                if (!v2Var.hasNext()) {
                    num = null;
                    break;
                }
                int f4 = (int) h3.f(((Integer) v2Var.next()).intValue());
                num = Integer.valueOf(f4);
                if (f4 > 0) {
                    break;
                }
            }
            int intValue = num != null ? num.intValue() : 0;
            ArrayList f13 = o70.f1(h3.d(21), h3.d(31));
            ArrayList arrayList = new ArrayList();
            int size4 = f13.size();
            int i7 = 0;
            while (i7 < size4) {
                Object obj6 = f13.get(i7);
                i7++;
                cp0 h4 = h((byte[]) obj6);
                String l5 = h4.l(b5);
                byte b8 = b4;
                byte b9 = b5;
                int f5 = (int) h4.f(i2);
                ArrayList arrayList2 = f13;
                int f6 = (int) h4.f(3);
                Iterator it9 = h4.d(4).iterator();
                PlayAddr g2 = it9.hasNext() ? g((byte[]) it9.next()) : null;
                PlayAddr playAddr3 = g2 == null ? new PlayAddr((List) null, (String) null, 0, 0, 0L, 31, (er0) null) : g2;
                Integer[] numArr2 = new Integer[2];
                numArr2[b8] = 5;
                numArr2[b9] = 7;
                v2 v2Var2 = new v2(numArr2, b9);
                while (true) {
                    if (!v2Var2.hasNext()) {
                        num2 = null;
                        break;
                    }
                    v2 v2Var3 = v2Var2;
                    int f7 = (int) h4.f(((Integer) v2Var2.next()).intValue());
                    num2 = Integer.valueOf(f7);
                    if (f7 != 0) {
                        break;
                    }
                    v2Var2 = v2Var3;
                }
                BitRate bitRate = (playAddr3.getUrlList().isEmpty() && l5.length() == 0) ? null : new BitRate(l5, f6, f5, num2 != null ? num2.intValue() : b8, 0, 0, (String) null, playAddr3, 112, (er0) null);
                if (bitRate != null) {
                    arrayList.add(bitRate);
                }
                i2 = 2;
                f13 = arrayList2;
                b4 = b8;
                b5 = 1;
            }
            b2 = b4;
            video = new Video(arrayList, !playAddr.getUrlList().isEmpty() ? playAddr : playAddr2, (PlayAddr) null, playAddr2, cover2, cover4, cover6, (List) null, intValue, f3, f2, l4, (String) null, 4228, (er0) null);
        } else {
            aweme = null;
            b2 = 0;
            video = null;
        }
        Video video2 = video == null ? new Video((List) null, (PlayAddr) null, (PlayAddr) null, (PlayAddr) null, (Cover) null, (Cover) null, (Cover) null, (List) null, 0, 0, 0, (String) null, (String) null, 8191, (er0) null) : video;
        Iterator it10 = o70.f1(h.d(10), h.d(11)).iterator();
        if (it10.hasNext()) {
            cp0 h5 = h((byte[]) it10.next());
            obj = new Statistics(h5.f(3), h5.f(2), h5.f(6), h5.f(11), h5.f(5));
        } else {
            obj = aweme;
        }
        ?? statistics = obj == null ? new Statistics(0L, 0L, 0L, 0L, 0L, 31, (er0) null) : obj;
        long f8 = h.f(16);
        Integer[] numArr3 = new Integer[3];
        numArr3[b2] = 43;
        numArr3[1] = 55;
        numArr3[2] = 61;
        byte b10 = b2;
        re1 re1Var = new re1(new se1(new ep1(new fq(numArr3, b10), new tf2(h, (byte) 10)), new yv3((byte) 19), b10));
        while (true) {
            if (!re1Var.hasNext()) {
                obj2 = aweme;
                break;
            }
            obj2 = re1Var.next();
            int intValue2 = ((Number) obj2).intValue();
            if (intValue2 >= 0 && intValue2 < 201) {
                break;
            }
        }
        Integer num3 = (Integer) obj2;
        byte intValue3 = num3 != null ? num3.intValue() : b10;
        if (!jx4.L(str) && c(str)) {
            if (d.contains(Integer.valueOf(intValue3))) {
                return aweme;
            }
            return new Aweme(str, str2, video2, author, (Statistics) statistics, f, intValue3, (PlayProgress) null, f8, 0L, (String) null, (MixInfo) null, 3712, (er0) null);
        }
        if (i != 0) {
            return aweme;
        }
        u22 u22Var = new u22(1, 8, 1);
        ArrayList arrayList3 = new ArrayList();
        Iterator it11 = u22Var.iterator();
        while (((t22) it11).K) {
            u70.I0(arrayList3, h.d(((l22) it11).nextInt()));
        }
        int size5 = arrayList3.size();
        int i8 = b10;
        while (i8 < size5) {
            Object obj7 = arrayList3.get(i8);
            i8++;
            Aweme e = e(i + 1, (byte[]) obj7);
            if (e != null && !jx4.L(e.getAwemeId())) {
                return e;
            }
        }
        return aweme;
    }

    public static FeedResponse f(byte[] bArr) {
        bArr.getClass();
        if (bArr.length == 0) {
            zy.i("移动推荐响应为空");
            return null;
        }
        if (bArr[0] == 123) {
            throw new c13(new String(bArr, a));
        }
        cp0 h = h(bArr);
        boolean z = true;
        int f = (int) h.f(1);
        String l = h.l(2);
        if (f != 0) {
            if (jx4.L(l)) {
                l = "unknown";
            }
            b13.i("Server status_code=", f, ", msg=", l);
            return null;
        }
        Long g = h.g(4);
        if (g != null && g.longValue() == 0) {
            z = false;
        }
        boolean z2 = z;
        byte[] bArr2 = (byte[]) o70.U0(h.d(3));
        ArrayList d2 = h.d(5);
        boolean isEmpty = d2.isEmpty();
        List list = d2;
        if (isEmpty) {
            List d3 = bArr2 != null ? h(bArr2).d(5) : null;
            list = d3 == null ? o91.I : d3;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Aweme e = e(0, (byte[]) it.next());
            if (e != null) {
                arrayList.add(e);
            }
        }
        return new FeedResponse(arrayList, (List) null, z2, 0L, 0L, f, 26, (er0) null);
    }

    public static PlayAddr g(byte[] bArr) {
        cp0 h = h(bArr);
        return new PlayAddr(a(h, 0), h.l(1), (int) h.f(3), (int) h.f(4), h.f(6));
    }

    public static cp0 h(byte[] bArr) {
        int j;
        f13 e13Var;
        bArr.getClass();
        c70 b2 = c70.b(bArr);
        byte[] bArr2 = b2.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (!b2.a() && (j = b2.j()) != 0) {
            try {
                int i = j >>> 3;
                if (i != 0) {
                    int i2 = j & 7;
                    if (i2 != 0) {
                        e13Var = null;
                        if (i2 == 1) {
                            int i3 = b2.f;
                            if (b2.e - i3 < 8) {
                                throw y42.a();
                            }
                            b2.f = i3 + 8;
                            byte b3 = bArr2[i3];
                            byte b4 = bArr2[i3 + 1];
                            byte b5 = bArr2[i3 + 2];
                            byte b6 = bArr2[i3 + 3];
                            byte b7 = bArr2[i3 + 4];
                            byte b8 = bArr2[i3 + 5];
                            byte b9 = bArr2[i3 + 6];
                            byte b10 = bArr2[i3 + 7];
                        } else if (i2 == 2) {
                            byte[] d2 = b2.d();
                            d2.getClass();
                            e13Var = new d13(d2);
                        } else if (i2 == 5) {
                            int i4 = b2.f;
                            if (b2.e - i4 < 4) {
                                throw y42.a();
                            }
                            b2.f = i4 + 4;
                            byte b11 = bArr2[i4];
                            byte b12 = bArr2[i4 + 1];
                            byte b13 = bArr2[i4 + 2];
                            byte b14 = bArr2[i4 + 3];
                        } else if (!b2.k(j)) {
                            break;
                        }
                    } else {
                        e13Var = new e13(b2.g());
                    }
                    if (e13Var != null) {
                        Integer valueOf = Integer.valueOf(i);
                        Object obj = linkedHashMap.get(valueOf);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap.put(valueOf, obj);
                        }
                        ((List) obj).add(e13Var);
                    }
                } else if (!b2.k(j)) {
                    break;
                }
            } catch (y42 unused) {
            }
        }
        return new cp0(linkedHashMap);
    }
}
