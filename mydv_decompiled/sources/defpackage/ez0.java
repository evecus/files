package defpackage;

import com.github.mytv.dv.model.ChannelSettingResponse;
import com.github.mytv.dv.model.CommentListResponse;
import com.github.mytv.dv.model.FeedResponse;
import com.github.mytv.dv.model.HotSearchResponse;
import com.github.mytv.dv.model.InteractionMutationResponse;
import com.github.mytv.dv.model.LiveFeedResponse;
import com.github.mytv.dv.model.LiveFeedResponseHome;
import com.github.mytv.dv.model.LiveRoomEnterResponse;
import com.github.mytv.dv.model.LiveRoomResponse;
import com.github.mytv.dv.model.MixDetailResponse;
import com.github.mytv.dv.model.MixListResponse;
import com.github.mytv.dv.model.SearchLiveResponse;
import com.github.mytv.dv.model.SearchSugResponse;
import com.github.mytv.dv.model.SuggestWordsResponse;
import com.github.mytv.dv.model.UserListResponse;
import com.github.mytv.dv.model.UserProfileResponse;
import com.github.mytv.dv.model.UserWorksResponse;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ez0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ n11 J;
    public final /* synthetic */ String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez0(n11 n11Var, String str, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = n11Var;
        this.K = str;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        String str = this.K;
        n11 n11Var = this.J;
        switch (b) {
            case 0:
                return new ez0(n11Var, str, fj0Var, (byte) 0);
            case 1:
                return new ez0(n11Var, str, fj0Var, (byte) 1);
            case 2:
                return new ez0(n11Var, str, fj0Var, (byte) 2);
            case 3:
                return new ez0(n11Var, str, fj0Var, (byte) 3);
            case 4:
                return new ez0(n11Var, str, fj0Var, (byte) 4);
            case 5:
                return new ez0(n11Var, str, fj0Var, (byte) 5);
            case 6:
                return new ez0(n11Var, str, fj0Var, (byte) 6);
            case 7:
                return new ez0(n11Var, str, fj0Var, (byte) 7);
            case 8:
                return new ez0(n11Var, str, fj0Var, (byte) 8);
            case 9:
                return new ez0(n11Var, str, fj0Var, (byte) 9);
            case 10:
                return new ez0(n11Var, str, fj0Var, (byte) 10);
            case 11:
                return new ez0(n11Var, str, fj0Var, (byte) 11);
            case 12:
                return new ez0(n11Var, str, fj0Var, (byte) 12);
            case 13:
                return new ez0(n11Var, str, fj0Var, (byte) 13);
            case 14:
                return new ez0(n11Var, str, fj0Var, (byte) 14);
            case 15:
                return new ez0(n11Var, str, fj0Var, (byte) 15);
            case 16:
                return new ez0(n11Var, str, fj0Var, (byte) 16);
            case 17:
                return new ez0(n11Var, str, fj0Var, (byte) 17);
            case 18:
                return new ez0(n11Var, str, fj0Var, (byte) 18);
            case 19:
                return new ez0(n11Var, str, fj0Var, (byte) 19);
            case 20:
                return new ez0(n11Var, str, fj0Var, (byte) 20);
            case 21:
                return new ez0(n11Var, str, fj0Var, (byte) 21);
            case 22:
                return new ez0(n11Var, str, fj0Var, (byte) 22);
            case 23:
                return new ez0(n11Var, str, fj0Var, (byte) 23);
            case 24:
                return new ez0(n11Var, str, fj0Var, (byte) 24);
            case 25:
                return new ez0(n11Var, str, fj0Var, (byte) 25);
            case 26:
                return new ez0(n11Var, str, fj0Var, (byte) 26);
            case 27:
                return new ez0(n11Var, str, fj0Var, (byte) 27);
            default:
                return new ez0(n11Var, str, fj0Var, (byte) 28);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((ez0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        String str = this.K;
        n11 n11Var = this.J;
        switch (b) {
            case 0:
                mu0.V(obj);
                z62 z62Var = n11Var.c;
                o63 o63Var = z62Var.b;
                return z62Var.b(str, InteractionMutationResponse.Companion.serializer());
            case 1:
                mu0.V(obj);
                z62 z62Var2 = n11Var.c;
                o63 o63Var2 = z62Var2.b;
                return z62Var2.b(str, LiveRoomEnterResponse.Companion.serializer());
            case 2:
                mu0.V(obj);
                z62 z62Var3 = n11Var.c;
                o63 o63Var3 = z62Var3.b;
                return z62Var3.b(str, ChannelSettingResponse.Companion.serializer());
            case 3:
                mu0.V(obj);
                z62 z62Var4 = n11Var.c;
                o63 o63Var4 = z62Var4.b;
                return z62Var4.b(str, MixListResponse.Companion.serializer());
            case 4:
                mu0.V(obj);
                z62 z62Var5 = n11Var.c;
                o63 o63Var5 = z62Var5.b;
                return z62Var5.b(str, CommentListResponse.Companion.serializer());
            case 5:
                mu0.V(obj);
                z62 z62Var6 = n11Var.c;
                o63 o63Var6 = z62Var6.b;
                return z62Var6.b(str, CommentListResponse.Companion.serializer());
            case 6:
                mu0.V(obj);
                z62 z62Var7 = n11Var.c;
                o63 o63Var7 = z62Var7.b;
                return z62Var7.b(str, FeedResponse.Companion.serializer());
            case 7:
                mu0.V(obj);
                z62 z62Var8 = n11Var.c;
                o63 o63Var8 = z62Var8.b;
                return z62Var8.b(str, HotSearchResponse.Companion.serializer());
            case 8:
                mu0.V(obj);
                z62 z62Var9 = n11Var.c;
                o63 o63Var9 = z62Var9.b;
                return z62Var9.b(str, LiveFeedResponse.Companion.serializer());
            case 9:
                mu0.V(obj);
                z62 z62Var10 = n11Var.c;
                o63 o63Var10 = z62Var10.b;
                return z62Var10.b(str, LiveFeedResponseHome.Companion.serializer());
            case 10:
                mu0.V(obj);
                z62 z62Var11 = n11Var.c;
                o63 o63Var11 = z62Var11.b;
                return z62Var11.b(str, LiveFeedResponse.Companion.serializer());
            case 11:
                mu0.V(obj);
                z62 z62Var12 = n11Var.c;
                o63 o63Var12 = z62Var12.b;
                return z62Var12.b(str, LiveRoomResponse.Companion.serializer());
            case 12:
                mu0.V(obj);
                z62 z62Var13 = n11Var.c;
                o63 o63Var13 = z62Var13.b;
                return z62Var13.b(str, UserWorksResponse.Companion.serializer());
            case 13:
                mu0.V(obj);
                z62 z62Var14 = n11Var.c;
                o63 o63Var14 = z62Var14.b;
                return z62Var14.b(str, MixDetailResponse.Companion.serializer());
            case 14:
                mu0.V(obj);
                z62 z62Var15 = n11Var.c;
                o63 o63Var15 = z62Var15.b;
                return z62Var15.b(str, FeedResponse.Companion.serializer());
            case 15:
                mu0.V(obj);
                z62 z62Var16 = n11Var.c;
                o63 o63Var16 = z62Var16.b;
                return z62Var16.b(str, FeedResponse.Companion.serializer());
            case 16:
                mu0.V(obj);
                z62 z62Var17 = n11Var.c;
                o63 o63Var17 = z62Var17.b;
                return z62Var17.b(str, FeedResponse.Companion.serializer());
            case 17:
                mu0.V(obj);
                z62 z62Var18 = n11Var.c;
                o63 o63Var18 = z62Var18.b;
                return z62Var18.b(str, SearchSugResponse.Companion.serializer());
            case 18:
                mu0.V(obj);
                z62 z62Var19 = n11Var.c;
                o63 o63Var19 = z62Var19.b;
                return z62Var19.b(str, SuggestWordsResponse.Companion.serializer());
            case 19:
                mu0.V(obj);
                z62 z62Var20 = n11Var.c;
                o63 o63Var20 = z62Var20.b;
                return z62Var20.b(str, UserWorksResponse.Companion.serializer());
            case 20:
                mu0.V(obj);
                z62 z62Var21 = n11Var.c;
                o63 o63Var21 = z62Var21.b;
                return z62Var21.b(str, UserWorksResponse.Companion.serializer());
            case 21:
                mu0.V(obj);
                z62 z62Var22 = n11Var.c;
                o63 o63Var22 = z62Var22.b;
                return z62Var22.b(str, UserListResponse.Companion.serializer());
            case 22:
                mu0.V(obj);
                z62 z62Var23 = n11Var.c;
                o63 o63Var23 = z62Var23.b;
                return z62Var23.b(str, UserListResponse.Companion.serializer());
            case 23:
                mu0.V(obj);
                z62 z62Var24 = n11Var.c;
                o63 o63Var24 = z62Var24.b;
                return z62Var24.b(str, MixListResponse.Companion.serializer());
            case 24:
                mu0.V(obj);
                z62 z62Var25 = n11Var.c;
                o63 o63Var25 = z62Var25.b;
                return z62Var25.b(str, UserProfileResponse.Companion.serializer());
            case 25:
                mu0.V(obj);
                z62 z62Var26 = n11Var.c;
                o63 o63Var26 = z62Var26.b;
                return z62Var26.b(str, UserWorksResponse.Companion.serializer());
            case 26:
                mu0.V(obj);
                z62 z62Var27 = n11Var.c;
                o63 o63Var27 = z62Var27.b;
                return z62Var27.b(str, UserWorksResponse.Companion.serializer());
            case 27:
                mu0.V(obj);
                z62 z62Var28 = n11Var.c;
                o63 o63Var28 = z62Var28.b;
                return z62Var28.b(str, UserWorksResponse.Companion.serializer());
            default:
                mu0.V(obj);
                z62 z62Var29 = n11Var.c;
                o63 o63Var29 = z62Var29.b;
                return z62Var29.b(str, SearchLiveResponse.Companion.serializer());
        }
    }
}
