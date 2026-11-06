package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Util;
import defpackage.dy1;
import defpackage.hf1;
import defpackage.sp0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public final String description;

    @Deprecated
    public final String value;
    public final dy1 values;

    public TextInformationFrame(String str, String str2, List<String> list) {
        super(str);
        sp0.o(!list.isEmpty());
        this.description = str2;
        dy1 p = dy1.p(list);
        this.values = p;
        this.value = (String) p.get(0);
    }

    private static List<Integer> parseId3v2point4TimestampFrameForDate(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (Objects.equals(this.id, textInformationFrame.id) && Objects.equals(this.description, textInformationFrame.description) && this.values.equals(textInformationFrame.values)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n = hf1.n(527, 31, this.id);
        String str = this.description;
        return this.values.hashCode() + ((n + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.id;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                break;
            case 2581856:
                if (str.equals("TPOS")) {
                    c = 21;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 22;
                    break;
                }
                break;
            case 2584864:
                if (str.equals("TSST")) {
                    c = 23;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 24;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    builder.setAlbumTitle((CharSequence) this.values.get(0));
                    break;
                case 1:
                case 11:
                    builder.setComposer((CharSequence) this.values.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = (String) this.values.get(0);
                    builder.setRecordingMonth(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).setRecordingDay(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    builder.setArtist((CharSequence) this.values.get(0));
                    break;
                case 4:
                case 19:
                    builder.setAlbumArtist((CharSequence) this.values.get(0));
                    break;
                case 5:
                case 20:
                    builder.setConductor((CharSequence) this.values.get(0));
                    break;
                case 6:
                case 22:
                    String[] split = Util.split((String) this.values.get(0), "/");
                    builder.setTrackNumber(Integer.valueOf(Integer.parseInt(split[0]))).setTotalTrackCount(split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null);
                    break;
                case 7:
                case 17:
                    builder.setTitle((CharSequence) this.values.get(0));
                    break;
                case '\b':
                case 16:
                    builder.setWriter((CharSequence) this.values.get(0));
                    break;
                case '\t':
                case 24:
                    builder.setRecordingYear(Integer.valueOf(Integer.parseInt((String) this.values.get(0))));
                    break;
                case '\f':
                    Integer q0 = sp0.q0((String) this.values.get(0));
                    if (q0 != null) {
                        String resolveV1Genre = Id3Util.resolveV1Genre(q0.intValue());
                        if (resolveV1Genre != null) {
                            builder.setGenre(resolveV1Genre);
                            break;
                        }
                    } else {
                        builder.setGenre((CharSequence) this.values.get(0));
                        break;
                    }
                    break;
                case 14:
                    List<Integer> parseId3v2point4TimestampFrameForDate = parseId3v2point4TimestampFrameForDate((String) this.values.get(0));
                    int size = parseId3v2point4TimestampFrameForDate.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.setRecordingDay(parseId3v2point4TimestampFrameForDate.get(2));
                            }
                        }
                        builder.setRecordingMonth(parseId3v2point4TimestampFrameForDate.get(1));
                    }
                    builder.setRecordingYear(parseId3v2point4TimestampFrameForDate.get(0));
                    break;
                case 15:
                    List<Integer> parseId3v2point4TimestampFrameForDate2 = parseId3v2point4TimestampFrameForDate((String) this.values.get(0));
                    int size2 = parseId3v2point4TimestampFrameForDate2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.setReleaseDay(parseId3v2point4TimestampFrameForDate2.get(2));
                            }
                        }
                        builder.setReleaseMonth(parseId3v2point4TimestampFrameForDate2.get(1));
                    }
                    builder.setReleaseYear(parseId3v2point4TimestampFrameForDate2.get(0));
                    break;
                case 21:
                    String[] split2 = Util.split((String) this.values.get(0), "/");
                    builder.setDiscNumber(Integer.valueOf(Integer.parseInt(split2[0]))).setTotalDiscCount(split2.length > 1 ? Integer.valueOf(Integer.parseInt(split2[1])) : null);
                    break;
                case 23:
                    builder.setDiscSubtitle((CharSequence) this.values.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.id + ": description=" + this.description + ": values=" + this.values;
    }

    @Deprecated
    public TextInformationFrame(String str, String str2, String str3) {
        this(str, str2, dy1.t(str3));
    }
}
