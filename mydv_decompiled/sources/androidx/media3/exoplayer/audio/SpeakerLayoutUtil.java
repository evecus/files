package androidx.media3.exoplayer.audio;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import defpackage.dy1;
import defpackage.hr;
import defpackage.j0;
import j$.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class SpeakerLayoutUtil {
    private static final dy1 DEFAULT_CHANNEL_MASK = dy1.t(12);
    private static final String TAG = "SpeakerLayoutUtil";

    private SpeakerLayoutUtil() {
    }

    private static dy1 getChannelMasksForBluetooth() {
        return DEFAULT_CHANNEL_MASK;
    }

    private static dy1 getChannelMasksForBuiltInSpeakers(AudioDeviceInfo audioDeviceInfo) {
        int speakerLayoutChannelMask;
        if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
            return dy1.t(Integer.valueOf(speakerLayoutChannelMask));
        }
        Log.w(TAG, "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
        return DEFAULT_CHANNEL_MASK;
    }

    private static dy1 getChannelMasksForHdmiArc(AudioDeviceInfo audioDeviceInfo) {
        dy1 channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        if (!channelMasksFromPcmAudioProfiles.isEmpty()) {
            return channelMasksFromPcmAudioProfiles;
        }
        dy1 allLpcmChannelMasksFromPcmSads = AudioDescriptorUtil.getAllLpcmChannelMasksFromPcmSads(audioDeviceInfo.getAudioDescriptors());
        return !allLpcmChannelMasksFromPcmSads.isEmpty() ? allLpcmChannelMasksFromPcmSads : DEFAULT_CHANNEL_MASK;
    }

    private static dy1 getChannelMasksForHdmiEarc(AudioDeviceInfo audioDeviceInfo) {
        dy1 channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        if (!channelMasksFromPcmAudioProfiles.isEmpty()) {
            return channelMasksFromPcmAudioProfiles;
        }
        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
        if (Build.VERSION.SDK_INT >= 34) {
            dy1 allChannelMasksFromSadbs = AudioDescriptorUtil.getAllChannelMasksFromSadbs(audioDescriptors);
            if (!allChannelMasksFromSadbs.isEmpty()) {
                return allChannelMasksFromSadbs;
            }
        }
        dy1 allLpcmChannelMasksFromPcmSads = AudioDescriptorUtil.getAllLpcmChannelMasksFromPcmSads(audioDescriptors);
        return !allLpcmChannelMasksFromPcmSads.isEmpty() ? allLpcmChannelMasksFromPcmSads : DEFAULT_CHANNEL_MASK;
    }

    private static dy1 getChannelMasksForUsb(AudioDeviceInfo audioDeviceInfo) {
        dy1 channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        return !channelMasksFromPcmAudioProfiles.isEmpty() ? channelMasksFromPcmAudioProfiles : DEFAULT_CHANNEL_MASK;
    }

    private static dy1 getChannelMasksFromPcmAudioProfiles(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(new hr((byte) 1))));
        Iterator<AudioProfile> it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile c = j0.c(it.next());
            if (c.getEncapsulationType() != 1 && Util.isEncodingLinearPcm(c.getFormat())) {
                for (int i : c.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return dy1.p(treeSet);
    }

    public static dy1 getLoudspeakerLayoutChannelMasks(AudioDeviceInfo audioDeviceInfo) {
        if (DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo.getType())) {
            return getChannelMasksForBluetooth();
        }
        if (DeviceTypeUtil.isBuiltInEarpiece(audioDeviceInfo.getType())) {
            return dy1.t(4);
        }
        if (DeviceTypeUtil.isBuiltInSpeaker(audioDeviceInfo.getType())) {
            return getChannelMasksForBuiltInSpeakers(audioDeviceInfo);
        }
        int i = Build.VERSION.SDK_INT;
        return (i < 31 || !DeviceTypeUtil.isHdmiArc(audioDeviceInfo.getType())) ? (i < 31 || !DeviceTypeUtil.isHdmiEarc(audioDeviceInfo.getType())) ? (i < 31 || !DeviceTypeUtil.isUsbDevice(audioDeviceInfo.getType())) ? DEFAULT_CHANNEL_MASK : getChannelMasksForUsb(audioDeviceInfo) : getChannelMasksForHdmiEarc(audioDeviceInfo) : getChannelMasksForHdmiArc(audioDeviceInfo);
    }
}
