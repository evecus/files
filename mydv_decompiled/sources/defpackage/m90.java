package defpackage;

import java.net.InetAddress;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;
import okhttp3.Dns;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m90 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ m90(r24 r24Var) {
        this.I = (byte) 26;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        CharSequence string$lambda$0$0;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                k51 k51Var = (k51) obj;
                k51Var.getClass();
                return Double.valueOf(jp.z(k51Var.k, 0.0d, 100.0d));
            case 1:
                ((k51) obj).getClass();
                return jp.j(4.5d);
            case 2:
                ((Long) obj).getClass();
                return wd5Var;
            case 3:
                return wd5Var;
            case 4:
                ((an3) obj).getClass();
                return wd5Var;
            case 5:
                String str = (String) obj;
                str.getClass();
                return str;
            case 6:
                ((String) obj).getClass();
                return "word";
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            case 8:
                ((Long) obj).getClass();
                return wd5Var;
            case 9:
                string$lambda$0$0 = Dns.Record.ServiceMetadata.toString$lambda$0$0((InetAddress) obj);
                return string$lambda$0$0;
            case 10:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return entry2.getKey() + "=" + entry2.getValue();
            case 11:
                Map.Entry entry3 = (Map.Entry) obj;
                entry3.getClass();
                return entry3.getKey() + "=" + entry3.getValue();
            case 12:
                String str3 = (String) obj;
                str3.getClass();
                return "\"" + str3 + "\"";
            case 13:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case 14:
                Map.Entry entry4 = (Map.Entry) obj;
                entry4.getClass();
                return entry4.getKey() + "=" + entry4.getValue();
            case 15:
                Map.Entry entry5 = (Map.Entry) obj;
                entry5.getClass();
                return entry5.getKey() + "=" + entry5.getValue();
            case 16:
                Map.Entry entry6 = (Map.Entry) obj;
                entry6.getClass();
                return entry6.getKey() + "=" + entry6.getValue();
            case 17:
                Map.Entry entry7 = (Map.Entry) obj;
                entry7.getClass();
                return entry7.getKey() + "=" + entry7.getValue();
            case 18:
                Map.Entry entry8 = (Map.Entry) obj;
                return entry8.getKey() + "=" + entry8.getValue();
            case 19:
                Map.Entry entry9 = (Map.Entry) obj;
                return entry9.getKey() + "=" + entry9.getValue();
            case 20:
                Map.Entry entry10 = (Map.Entry) obj;
                return entry10.getKey() + "=" + entry10.getValue();
            case 21:
                Map.Entry entry11 = (Map.Entry) obj;
                entry11.getClass();
                String encode = URLEncoder.encode((String) entry11.getKey(), "UTF-8");
                encode.getClass();
                String encode2 = URLEncoder.encode((String) entry11.getValue(), "UTF-8");
                encode2.getClass();
                return encode + "=" + encode2;
            case 22:
                return Boolean.TRUE;
            case 23:
                km0 km0Var = (km0) obj;
                km0Var.getClass();
                return "[" + km0Var + ']';
            case 24:
                return wd5Var;
            case 25:
                return wd5Var;
            case 26:
                ((lv1) obj).getClass();
                return Boolean.TRUE;
            case 27:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 28:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            default:
                char charValue = ((Character) obj).charValue();
                return Boolean.valueOf(charValue == 'T' || charValue == 't');
        }
    }

    public /* synthetic */ m90(byte b) {
        this.I = b;
    }
}
