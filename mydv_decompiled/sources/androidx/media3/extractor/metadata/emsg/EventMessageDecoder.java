package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    public EventMessage decode(ParsableByteArray parsableByteArray) {
        String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
        readNullTerminatedString.getClass();
        String readNullTerminatedString2 = parsableByteArray.readNullTerminatedString();
        readNullTerminatedString2.getClass();
        return new EventMessage(readNullTerminatedString, readNullTerminatedString2, parsableByteArray.readLong(), parsableByteArray.readLong(), Arrays.copyOfRange(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.limit()));
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    public Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return new Metadata(decode(new ParsableByteArray(byteBuffer.array(), byteBuffer.limit())));
    }
}
