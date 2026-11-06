package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.common.text.Cue;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.Output {
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private final List<SubtitlePainter> painters;
    private CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new ArrayList();
        this.cues = Collections.EMPTY_LIST;
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }

    private static Cue repositionVerticalCue(Cue cue) {
        Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        int i = cue.lineType;
        float f = cue.line;
        if (i == 0) {
            textAlignment.setLine(1.0f - f, 0);
        } else {
            textAlignment.setLine((-f) - 1.0f, 1);
        }
        int i2 = cue.lineAnchor;
        if (i2 == 0) {
            textAlignment.setLineAnchor(2);
        } else if (i2 == 2) {
            textAlignment.setLineAnchor(0);
        }
        return textAlignment.build();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<Cue> list = this.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float resolveTextSize = SubtitleViewUtils.resolveTextSize(this.textSizeType, this.textSize, height, i);
        if (resolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Cue cue = list.get(i2);
            if (cue.verticalType != Integer.MIN_VALUE) {
                cue = repositionVerticalCue(cue);
            }
            this.painters.get(i2).draw(cue, this.style, resolveTextSize, SubtitleViewUtils.resolveTextSize(cue.textSizeType, cue.textSize, height, i), this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f;
        this.textSizeType = i;
        this.bottomPaddingFraction = f2;
        while (this.painters.size() < list.size()) {
            this.painters.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }
}
