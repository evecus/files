package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import defpackage.dy1;
import defpackage.ee5;
import defpackage.hy1;
import defpackage.iy1;
import defpackage.j0;
import defpackage.ry1;
import defpackage.sp0;
import defpackage.sy1;
import defpackage.ut0;
import defpackage.x24;
import defpackage.zx1;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AudioCapabilities {
    static final iy1 ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES;
    private static final dy1 DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS;
    static final int DEFAULT_MAX_CHANNEL_COUNT = 10;
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final dy1 DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
    private static final dy1 EXTERNAL_SURROUND_SOUND_ENCODINGS;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private static final String FORCE_EXTERNAL_SURROUND_SOUND_KEY = "use_external_surround_sound_flag";
    private final SparseArray<AudioProfile> encodingToAudioProfile;
    private final int maxChannelCount;
    private final dy1 spatializerChannelMasks;
    private final dy1 speakerLayoutChannelMasks;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Api29 {
        private Api29() {
        }

        public static dy1 getDirectPlaybackSupportedEncodings(AudioAttributes audioAttributes) {
            zx1 n = dy1.n();
            ee5 it = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), audioAttributes.getPlatformAudioAttributes())) {
                    n.c(num);
                }
            }
            n.c(2);
            return n.f();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2, AudioAttributes audioAttributes) {
            for (int i3 = 10; i3 > 0; i3--) {
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i3);
                if (audioTrackChannelConfig != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(audioTrackChannelConfig).build(), audioAttributes.getPlatformAudioAttributes())) {
                    return i3;
                }
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Api33 {
        private Api33() {
        }

        public static AudioCapabilities getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, AudioAttributes audioAttributes, List<Integer> list, List<Integer> list2) {
            return new AudioCapabilities(AudioCapabilities.getAudioProfiles(audioManager.getDirectProfilesForAttributes(audioAttributes.getPlatformAudioAttributes())), list, list2);
        }

        public static AudioDeviceInfo getDefaultRoutedDeviceForAttributes(AudioManager audioManager, AudioAttributes audioAttributes) {
            audioManager.getClass();
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(audioAttributes.getPlatformAudioAttributes());
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return audioDevicesForAttributes.get(0);
        }
    }

    static {
        x24 t = dy1.t(12);
        DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS = t;
        x24 x24Var = x24.M;
        DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS = x24Var;
        DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(dy1.t(AudioProfile.DEFAULT_AUDIO_PROFILE), t, x24Var);
        Object[] objArr = {2, 5, 6};
        ut0.k(3, objArr);
        EXTERNAL_SURROUND_SOUND_ENCODINGS = dy1.m(3, objArr);
        hy1 hy1Var = new hy1(4);
        hy1Var.b(5, 6);
        hy1Var.b(17, 6);
        hy1Var.b(7, 6);
        hy1Var.b(30, 10);
        hy1Var.b(18, 6);
        hy1Var.b(6, 8);
        hy1Var.b(8, 8);
        hy1Var.b(14, 8);
        ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = hy1Var.a(true);
    }

    private AudioCapabilities(List<AudioProfile> list, List<Integer> list2, List<Integer> list3) {
        this.encodingToAudioProfile = new SparseArray<>();
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfile = list.get(i);
            this.encodingToAudioProfile.put(audioProfile.encoding, audioProfile);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.encodingToAudioProfile.size(); i3++) {
            i2 = Math.max(i2, this.encodingToAudioProfile.valueAt(i3).maxChannelCount);
        }
        this.maxChannelCount = i2;
        this.speakerLayoutChannelMasks = dy1.p(list2);
        this.spatializerChannelMasks = dy1.p(list3);
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static dy1 getAudioProfiles(List<android.media.AudioProfile> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(sp0.j(12)));
        for (int i = 0; i < list.size(); i++) {
            android.media.AudioProfile c = j0.c(list.get(i));
            if (c.getEncapsulationType() != 1) {
                int format = c.getFormat();
                if (Util.isEncodingLinearPcm(format) || ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(sp0.j(c.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(sp0.j(c.getChannelMasks())));
                    }
                }
            }
        }
        zx1 n = dy1.n();
        for (Map.Entry entry : hashMap.entrySet()) {
            n.c(new AudioProfile(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return n.f();
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, AudioAttributes.DEFAULT, null);
    }

    public static AudioCapabilities getCapabilitiesInternal(Context context, Intent intent, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        AudioManager audioManager = AudioManagerCompat.getAudioManager(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? Api33.getDefaultRoutedDeviceForAttributes(audioManager, audioAttributes) : null;
        }
        dy1 loudspeakerLayoutChannelMasks = audioDeviceInfo != null ? SpeakerLayoutUtil.getLoudspeakerLayoutChannelMasks(audioDeviceInfo) : DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (Util.isTv(context) || Util.isAutomotive(context))) {
            return Api33.getCapabilitiesInternalForDirectPlayback(audioManager, audioAttributes, loudspeakerLayoutChannelMasks, list);
        }
        if (isBluetoothConnected(audioManager, audioDeviceInfo)) {
            return new AudioCapabilities(dy1.t(AudioProfile.DEFAULT_AUDIO_PROFILE), loudspeakerLayoutChannelMasks, list);
        }
        ry1 ry1Var = new ry1(4);
        ry1Var.c(2);
        if (i >= 29 && (Util.isTv(context) || Util.isAutomotive(context))) {
            dy1 directPlaybackSupportedEncodings = Api29.getDirectPlaybackSupportedEncodings(audioAttributes);
            directPlaybackSupportedEncodings.getClass();
            ry1Var.d(directPlaybackSupportedEncodings);
            return new AudioCapabilities(getAudioProfiles(sp0.j0(ry1Var.g()), 10), loudspeakerLayoutChannelMasks, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, FORCE_EXTERNAL_SURROUND_SOUND_KEY, 0) == 1;
        if ((z || deviceMaySetExternalSurroundSoundGlobalSetting()) && Settings.Global.getInt(contentResolver, EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            dy1 dy1Var = EXTERNAL_SURROUND_SOUND_ENCODINGS;
            dy1Var.getClass();
            ry1Var.d(dy1Var);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new AudioCapabilities(getAudioProfiles(sp0.j0(ry1Var.g()), 10), loudspeakerLayoutChannelMasks, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List j = sp0.j(intArrayExtra);
            j.getClass();
            ry1Var.d(j);
        }
        return new AudioCapabilities(getAudioProfiles(sp0.j0(ry1Var.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), loudspeakerLayoutChannelMasks, list);
    }

    private static int getChannelConfigForPassthrough(int i, Format format) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (MediaLibraryInfo.enableWorkarounds() && i2 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int i3 = format.channelMask;
        return (i3 == -1 || format.channelCount != i) ? Util.getAudioTrackChannelConfig(i) : i3;
    }

    public static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    private static boolean isBluetoothConnected(AudioManager audioManager, AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (audioDeviceInfo == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{audioDeviceInfo};
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfoArr) {
            if (DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo2.getType())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Util.contentEquals(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount && Objects.equals(this.speakerLayoutChannelMasks, audioCapabilities.speakerLayoutChannelMasks) && Objects.equals(this.spatializerChannelMasks, audioCapabilities.spatializerChannelMasks);
    }

    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format, AudioAttributes audioAttributes) {
        String str = format.sampleMimeType;
        str.getClass();
        int encoding = MimeTypes.getEncoding(str, format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        AudioProfile audioProfile = this.encodingToAudioProfile.get(encoding);
        audioProfile.getClass();
        int i = format.channelCount;
        if (i == -1 || encoding == 18) {
            int i2 = format.sampleRate;
            if (i2 == -1) {
                i2 = 48000;
            }
            i = audioProfile.getMaxSupportedChannelCountForPassthrough(i2, audioAttributes);
        } else if (!format.sampleMimeType.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!audioProfile.supportsChannelConfig(i, format)) {
                return null;
            }
        } else if (i > 10) {
            return null;
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(i, format);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public dy1 getSpatializerChannelMasks() {
        return this.spatializerChannelMasks;
    }

    public dy1 getSpeakerLayoutChannelMasks() {
        return this.speakerLayoutChannelMasks;
    }

    public int hashCode() {
        return Objects.hashCode(this.spatializerChannelMasks) + ((Objects.hashCode(this.speakerLayoutChannelMasks) + ((Util.contentHashCode(this.encodingToAudioProfile) + (this.maxChannelCount * 31)) * 31)) * 31);
    }

    public boolean isPassthroughPlaybackSupported(Format format, AudioAttributes audioAttributes) {
        return getEncodingAndChannelConfigForPassthrough(format, audioAttributes) != null;
    }

    public boolean supportsEncoding(int i) {
        return Util.contains(this.encodingToAudioProfile, i);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + this.encodingToAudioProfile + ", speakerLayoutChannelMasks=" + this.speakerLayoutChannelMasks + ", spatializerChannelMasks=" + this.spatializerChannelMasks + "]";
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo) {
        return getCapabilities(context, audioAttributes, audioDeviceInfo, DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS);
    }

    public static AudioCapabilities getCapabilities(Context context, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        return getCapabilitiesInternal(context, audioAttributes, audioDeviceInfo, list);
    }

    @Deprecated
    public boolean isPassthroughPlaybackSupported(Format format) {
        return isPassthroughPlaybackSupported(format, AudioAttributes.DEFAULT);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class AudioProfile {
        public static final AudioProfile DEFAULT_AUDIO_PROFILE;
        private final sy1 channelMasks;
        public final int encoding;
        public final int maxChannelCount;

        static {
            DEFAULT_AUDIO_PROFILE = Build.VERSION.SDK_INT >= 33 ? new AudioProfile(2, getAllChannelMasksForMaxChannelCount(10)) : new AudioProfile(2, 10);
        }

        public AudioProfile(int i, Set<Integer> set) {
            this.encoding = i;
            sy1 o = sy1.o(set);
            this.channelMasks = o;
            ee5 it = o.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.maxChannelCount = i2;
        }

        private static sy1 getAllChannelMasksForMaxChannelCount(int i) {
            ry1 ry1Var = new ry1(4);
            for (int i2 = 1; i2 <= i; i2++) {
                ry1Var.c(Integer.valueOf(Util.getAudioTrackChannelConfig(i2)));
            }
            return ry1Var.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean supportsChannelConfig(int i, Format format) {
            if (this.channelMasks == null) {
                return i <= this.maxChannelCount;
            }
            int i2 = format.channelMask;
            if (i2 == -1 || format.channelCount != i) {
                i2 = Util.getAudioTrackChannelConfig(i);
            }
            if (i2 == 0) {
                return false;
            }
            return this.channelMasks.contains(Integer.valueOf(i2));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioProfile)) {
                return false;
            }
            AudioProfile audioProfile = (AudioProfile) obj;
            return this.encoding == audioProfile.encoding && this.maxChannelCount == audioProfile.maxChannelCount && Objects.equals(this.channelMasks, audioProfile.channelMasks);
        }

        public int getMaxSupportedChannelCountForPassthrough(int i, AudioAttributes audioAttributes) {
            if (this.channelMasks != null) {
                return this.maxChannelCount;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                return Api29.getMaxSupportedChannelCountForPassthrough(this.encoding, i, audioAttributes);
            }
            Object obj = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.get(Integer.valueOf(this.encoding));
            return ((Integer) (obj != null ? obj : 0)).intValue();
        }

        public int hashCode() {
            int i = ((this.encoding * 31) + this.maxChannelCount) * 31;
            sy1 sy1Var = this.channelMasks;
            return i + (sy1Var == null ? 0 : sy1Var.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + this.channelMasks + "]";
        }

        public AudioProfile(int i, int i2) {
            this.encoding = i;
            this.maxChannelCount = i2;
            this.channelMasks = null;
        }
    }

    @Deprecated
    public AudioCapabilities(int[] iArr, int i) {
        this(getAudioProfiles(iArr, i), DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS, DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS);
    }

    public AudioCapabilities(int[] iArr, int i, List<Integer> list, List<Integer> list2) {
        this(getAudioProfiles(iArr, i), list, list2);
    }

    @Deprecated
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        return getEncodingAndChannelConfigForPassthrough(format, AudioAttributes.DEFAULT);
    }

    private static dy1 getAudioProfiles(int[] iArr, int i) {
        zx1 n = dy1.n();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            n.c(new AudioProfile(i2, i));
        }
        return n.f();
    }

    public static AudioCapabilities getCapabilitiesInternal(Context context, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        return getCapabilitiesInternal(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfo, list);
    }
}
