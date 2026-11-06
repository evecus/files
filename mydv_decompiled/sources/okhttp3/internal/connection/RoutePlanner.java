package okhttp3.internal.connection;

import defpackage.er0;
import defpackage.j42;
import defpackage.pp;
import okhttp3.Address;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface RoutePlanner {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Plan {
        /* renamed from: cancel */
        void mo352cancel();

        /* renamed from: connectTcp */
        ConnectResult mo356connectTcp();

        /* renamed from: connectTlsEtc */
        ConnectResult mo357connectTlsEtc();

        /* renamed from: handleSuccess */
        RealConnection mo353handleSuccess();

        boolean isReady();

        /* renamed from: retry */
        Plan mo354retry();
    }

    Address getAddress();

    pp getDeferredPlans();

    boolean hasNext(RealConnection realConnection);

    boolean isCanceled();

    Plan plan();

    boolean sameHostAndPort(HttpUrl httpUrl);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ConnectResult {
        private final Plan nextPlan;
        private final Plan plan;
        private final Throwable throwable;

        public /* synthetic */ ConnectResult(Plan plan, Plan plan2, Throwable th, int i, er0 er0Var) {
            this(plan, (i & 2) != 0 ? null : plan2, (i & 4) != 0 ? null : th);
        }

        public static /* synthetic */ ConnectResult copy$default(ConnectResult connectResult, Plan plan, Plan plan2, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                plan = connectResult.plan;
            }
            if ((i & 2) != 0) {
                plan2 = connectResult.nextPlan;
            }
            if ((i & 4) != 0) {
                th = connectResult.throwable;
            }
            return connectResult.copy(plan, plan2, th);
        }

        public final Plan component1() {
            return this.plan;
        }

        public final Plan component2() {
            return this.nextPlan;
        }

        public final Throwable component3() {
            return this.throwable;
        }

        public final ConnectResult copy(Plan plan, Plan plan2, Throwable th) {
            plan.getClass();
            return new ConnectResult(plan, plan2, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectResult)) {
                return false;
            }
            ConnectResult connectResult = (ConnectResult) obj;
            return j42.c(this.plan, connectResult.plan) && j42.c(this.nextPlan, connectResult.nextPlan) && j42.c(this.throwable, connectResult.throwable);
        }

        public final Plan getNextPlan() {
            return this.nextPlan;
        }

        public final Plan getPlan() {
            return this.plan;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            int hashCode = this.plan.hashCode() * 31;
            Plan plan = this.nextPlan;
            int hashCode2 = (hashCode + (plan == null ? 0 : plan.hashCode())) * 31;
            Throwable th = this.throwable;
            return hashCode2 + (th != null ? th.hashCode() : 0);
        }

        public final boolean isSuccess() {
            return this.nextPlan == null && this.throwable == null;
        }

        public String toString() {
            return "ConnectResult(plan=" + this.plan + ", nextPlan=" + this.nextPlan + ", throwable=" + this.throwable + ')';
        }

        public ConnectResult(Plan plan, Plan plan2, Throwable th) {
            plan.getClass();
            this.plan = plan;
            this.nextPlan = plan2;
            this.throwable = th;
        }
    }
}
