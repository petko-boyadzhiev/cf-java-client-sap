package org.cloudfoundry.client.lib.domain;

import java.util.Map;
import java.util.UUID;

import org.cloudfoundry.client.lib.domain.annotation.Nullable;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableCloudServiceBinding.class)
@JsonDeserialize(as = ImmutableCloudServiceBinding.class)
public interface CloudServiceBinding extends CloudEntity {

    UUID getApplicationGuid();

    @Nullable
    Map<String, Object> getBindingOptions();

    @Nullable
    Map<String, Object> getCredentials();

    @Nullable
    Map<String, Object> getBindingParameters();

    @Nullable
    String getSyslogDrainUrl();

}
