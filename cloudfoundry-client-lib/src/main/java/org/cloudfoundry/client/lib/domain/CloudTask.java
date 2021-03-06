package org.cloudfoundry.client.lib.domain;

import org.cloudfoundry.client.lib.domain.ImmutableCloudTask.ImmutableResult;
import org.cloudfoundry.client.lib.domain.annotation.Nullable;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Enclosing
@Value.Immutable
@JsonSerialize(as = ImmutableCloudTask.class)
@JsonDeserialize(as = ImmutableCloudTask.class)
public interface CloudTask extends CloudEntity {

    @Nullable
    String getCommand();

    @Nullable
    Integer getMemory();

    @Nullable
    Integer getDiskQuota();

    @Nullable
    Result getResult();

    @Nullable
    State getState();

    enum State {
        PENDING, RUNNING, SUCCEEDED, CANCELING, FAILED;
    }

    @Value.Immutable
    @JsonSerialize(as = ImmutableResult.class)
    @JsonDeserialize(as = ImmutableResult.class)
    interface Result {

        @Nullable
        String getFailureReason();

    }

}
