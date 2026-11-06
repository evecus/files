package androidx.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources resources;

    public DefaultTrackNameProvider(Resources resources) {
        resources.getClass();
        this.resources = resources;
    }

    private String buildAudioChannelString(Format format) {
        int i = format.channelCount;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.resources.getString(R.string.exo_track_mono);
        }
        if (i == 2) {
            return this.resources.getString(R.string.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.resources.getString(R.string.exo_track_surround_5_point_1);
        }
        Resources resources = this.resources;
        return i != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
    }

    private String buildBitrateString(Format format) {
        int i = format.bitrate;
        return i == -1 ? "" : this.resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    private String buildLabelString(Format format) {
        return TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    private String buildLanguageOrLabelString(Format format) {
        String joinWithSeparator = joinWithSeparator(buildLanguageString(format), buildRoleString(format));
        return TextUtils.isEmpty(joinWithSeparator) ? buildLabelString(format) : joinWithSeparator;
    }

    private String buildLanguageString(Format format) {
        String str = format.language;
        if (TextUtils.isEmpty(str) || C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Locale defaultDisplayLocale = Util.getDefaultDisplayLocale();
        String displayName = forLanguageTag.getDisplayName(defaultDisplayLocale);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(defaultDisplayLocale) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String buildResolutionString(Format format) {
        int i = format.width;
        int i2 = format.height;
        return (i == -1 || i2 == -1) ? "" : this.resources.getString(R.string.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private String buildRoleString(Format format) {
        String string = (format.roleFlags & 2) != 0 ? this.resources.getString(R.string.exo_track_role_alternate) : "";
        if ((format.roleFlags & 4) != 0) {
            string = joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            string = joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    private static int inferPrimaryTrackType(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }

    private String joinWithSeparator(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                str = TextUtils.isEmpty(str) ? str2 : this.resources.getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    @Override // androidx.media3.ui.TrackNameProvider
    public String getTrackName(Format format) {
        int inferPrimaryTrackType = inferPrimaryTrackType(format);
        String joinWithSeparator = inferPrimaryTrackType == 2 ? joinWithSeparator(buildRoleString(format), buildResolutionString(format), buildBitrateString(format)) : inferPrimaryTrackType == 1 ? joinWithSeparator(buildLanguageOrLabelString(format), buildAudioChannelString(format), buildBitrateString(format)) : buildLanguageOrLabelString(format);
        if (!joinWithSeparator.isEmpty()) {
            return joinWithSeparator;
        }
        String str = format.language;
        return (str == null || str.trim().isEmpty()) ? this.resources.getString(R.string.exo_track_unknown) : this.resources.getString(R.string.exo_track_unknown_name, str);
    }
}
