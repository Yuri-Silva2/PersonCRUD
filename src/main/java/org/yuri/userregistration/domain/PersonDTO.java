package org.yuri.userregistration.domain;

import jakarta.validation.constraints.NotBlank;

public record PersonDTO(@NotBlank String id, @NotBlank String name, @NotBlank String password) { }
