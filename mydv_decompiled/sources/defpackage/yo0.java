package defpackage;

import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class yo0 implements tm1 {
    public final /* synthetic */ Map I;
    public final /* synthetic */ Paint J;
    public final /* synthetic */ float K;

    public /* synthetic */ yo0(Map map, Paint paint, float f) {
        this.I = map;
        this.J = paint;
        this.K = f;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        List list;
        String str = (String) obj;
        str.getClass();
        Pattern pattern = t81.a;
        Map map = this.I;
        map.getClass();
        if (map.isEmpty() || !jx4.E(str, '[')) {
            list = p70.j0(new p81(str));
        } else {
            ArrayList arrayList = new ArrayList();
            Matcher matcher = t81.a.matcher(str);
            int i = 0;
            while (matcher.find()) {
                if (matcher.start() > i) {
                    arrayList.add(new p81(str.substring(i, matcher.start())));
                }
                String group = matcher.group();
                String str2 = (String) map.get(group);
                if (str2 != null) {
                    group.getClass();
                    arrayList.add(new o81(group, str2));
                } else {
                    group.getClass();
                    arrayList.add(new p81(group));
                }
                i = matcher.end();
            }
            list = arrayList;
            if (i < str.length()) {
                arrayList.add(new p81(str.substring(i)));
                list = arrayList;
            }
        }
        float[] fArr = new float[list.size()];
        float[] fArr2 = new float[list.size()];
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            q81 q81Var = (q81) list.get(i2);
            boolean z = q81Var instanceof p81;
            Paint paint = this.J;
            if (z) {
                float measureText = paint.measureText(((p81) q81Var).a);
                fArr[i2] = measureText;
                fArr2[i2] = measureText;
            } else {
                if (!(q81Var instanceof o81)) {
                    s83.v();
                    return null;
                }
                fArr[i2] = this.K;
                fArr2[i2] = paint.measureText(((o81) q81Var).a);
            }
        }
        bx2 bx2Var = new bx2(fArr, fArr2);
        return new xw2(bx2Var.d(), new g12(list, bx2Var, (byte) 24));
    }
}
