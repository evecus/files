package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.github.mytv.dv.model.LiveDanmakuMessage;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c22 implements tm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ c22(int i, uf2 uf2Var) {
        this.I = (byte) 14;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        byte b2 = 3;
        byte b3 = 4;
        byte b4 = 1;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                char charValue = ((Character) obj).charValue();
                if ('0' <= charValue && charValue < ':') {
                    r3 = true;
                }
                break;
            case 3:
                l60 l60Var = (l60) obj;
                l60Var.getClass();
                l60.a(l60Var, "JsonPrimitive", new v62(new d52(b4)));
                l60.a(l60Var, "JsonNull", new v62(new d52((byte) 2)));
                l60.a(l60Var, "JsonLiteral", new v62(new d52(b2)));
                l60.a(l60Var, "JsonObject", new v62(new d52(b3)));
                l60.a(l60Var, "JsonArray", new v62(new d52((byte) 5)));
                break;
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                StringBuilder sb = new StringBuilder();
                ex4.a(sb, str);
                sb.append(':');
                sb.append(bVar);
                break;
            case 6:
                ((Integer) obj).getClass();
                break;
            case 7:
                ((Integer) obj).getClass();
                break;
            case 8:
                break;
            case 9:
                List list = (List) obj;
                break;
            case 10:
                ((Integer) obj).getClass();
                break;
            case 11:
                ((Integer) obj).getClass();
                break;
            case 12:
                break;
            case 13:
                List list2 = (List) obj;
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                List list3 = (List) obj;
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                ((an3) obj).getClass();
                break;
            case 23:
                LiveDanmakuMessage liveDanmakuMessage = (LiveDanmakuMessage) obj;
                liveDanmakuMessage.getClass();
                break;
            case 24:
                ((LiveDanmakuMessage) obj).getClass();
                break;
            case 25:
                m00 m00Var = (m00) obj;
                m00Var.getClass();
                float b5 = r7.b(1.0f, m00Var);
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(qb.i0(hx2.g), PorterDuff.Mode.SRC_IN));
                break;
        }
        return Integer.valueOf(((Integer) obj).intValue() / 4);
    }

    public /* synthetic */ c22(byte b) {
        this.I = b;
    }
}
