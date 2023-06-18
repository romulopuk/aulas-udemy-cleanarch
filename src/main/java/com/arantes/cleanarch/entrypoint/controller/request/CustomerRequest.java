package com.arantes.cleanarch.entrypoint.controller.request;

import javax.validation.constraints.NotBlank;

public record CustomerRequest(
        @NotBlank
        String nome,
        @NotBlank
        String cpf,
        @NotBlank
        String zipCode) {
}
