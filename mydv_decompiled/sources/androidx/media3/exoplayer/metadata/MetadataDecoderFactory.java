package androidx.media3.exoplayer.metadata;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.metadata.MetadataDecoder;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import androidx.media3.extractor.metadata.icy.IcyDecoder;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.scte35.SpliceInfoDecoder;
import defpackage.hf1;
import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = new MetadataDecoderFactory() { // from class: androidx.media3.exoplayer.metadata.MetadataDecoderFactory.1
        @Override // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
        public MetadataDecoder createDecoder(Format format) {
            String str = format.sampleMimeType;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new AppInfoTableDecoder();
                    case "application/x-icy":
                        return new IcyDecoder();
                    case "application/id3":
                        return new Id3Decoder();
                    case "application/x-emsg":
                        return new EventMessageDecoder();
                    case "application/x-scte35":
                        return new SpliceInfoDecoder();
                }
            }
            s83.t(hf1.w("Attempted to create decoder for unsupported MIME type: ", str));
            return null;
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str);
        }
    };

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
