package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d91 extends mu0 {
    public final TextView d;
    public final m81 e;
    public boolean f = true;

    public d91(TextView textView) {
        this.d = textView;
        this.e = new m81(textView);
    }

    @Override // defpackage.mu0
    public final void T(boolean z) {
        if (z) {
            Z();
        }
    }

    @Override // defpackage.mu0
    public final void U(boolean z) {
        this.f = z;
        Z();
        TextView textView = this.d;
        textView.setFilters(w(textView.getFilters()));
    }

    public final void Z() {
        TextView textView = this.d;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f) {
            if (!(transformationMethod instanceof h91) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new h91(transformationMethod);
            }
        } else if (transformationMethod instanceof h91) {
            transformationMethod = ((h91) transformationMethod).I;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // defpackage.mu0
    public final InputFilter[] w(InputFilter[] inputFilterArr) {
        if (!this.f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof m81) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            m81 m81Var = this.e;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = m81Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == m81Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
