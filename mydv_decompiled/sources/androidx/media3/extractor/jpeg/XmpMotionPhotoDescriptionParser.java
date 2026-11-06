package androidx.media3.extractor.jpeg;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.jpeg.MotionPhotoDescription;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.r7;
import defpackage.x24;
import defpackage.zx1;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class XmpMotionPhotoDescriptionParser {
    private static final String TAG = "MotionPhotoXmpParser";
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private XmpMotionPhotoDescriptionParser() {
    }

    public static boolean isMotionPhotoXmp(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            if (str.contains(str2 + "=\"1\"")) {
                return true;
            }
        }
        return false;
    }

    public static MotionPhotoDescription parse(String str) {
        try {
            return parseInternal(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static MotionPhotoDescription parseInternal(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!XmlPullParserUtil.isStartTag(newPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        ay1 ay1Var = dy1.J;
        dy1 dy1Var = x24.M;
        long j = C.TIME_UNSET;
        while (true) {
            newPullParser.next();
            if (XmlPullParserUtil.isStartTag(newPullParser, "rdf:Description")) {
                if (!parseMotionPhotoFlagFromDescription(newPullParser)) {
                    break;
                }
                j = parseMotionPhotoPresentationTimestampUsFromDescription(newPullParser);
                dy1Var = parseMicroVideoOffsetFromDescription(newPullParser);
            } else if (XmlPullParserUtil.isStartTag(newPullParser, "Container:Directory")) {
                dy1Var = parseMotionPhotoV1Directory(newPullParser, "Container", "Item");
            } else if (XmlPullParserUtil.isStartTag(newPullParser, "GContainer:Directory")) {
                dy1Var = parseMotionPhotoV1Directory(newPullParser, "GContainer", "GContainerItem");
            }
            if (XmlPullParserUtil.isEndTag(newPullParser, "x:xmpmeta")) {
                if (!dy1Var.isEmpty()) {
                    return new MotionPhotoDescription(j, dy1Var);
                }
            }
        }
        return null;
    }

    private static dy1 parseMicroVideoOffsetFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return dy1.u(new MotionPhotoDescription.ContainerItem("image/jpeg", "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xmlPullParser) {
        for (String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long parseLong = Long.parseLong(attributeValue);
                return parseLong == -1 ? C.TIME_UNSET : parseLong;
            }
        }
        return C.TIME_UNSET;
    }

    private static dy1 parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) {
        zx1 n = dy1.n();
        String B = r7.B(str, ":Item");
        String B2 = r7.B(str, ":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, B)) {
                String B3 = r7.B(str2, ":Mime");
                String B4 = r7.B(str2, ":Semantic");
                String B5 = r7.B(str2, ":Length");
                String B6 = r7.B(str2, ":Padding");
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, B3);
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, B4);
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, B5);
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, B6);
                if (attributeValue == null || attributeValue2 == null) {
                    return x24.M;
                }
                n.c(new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, B2));
        return n.f();
    }
}
