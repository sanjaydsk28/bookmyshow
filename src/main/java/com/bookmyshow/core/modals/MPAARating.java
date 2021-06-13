package com.bookmyshow.core.modals;

import lombok.Getter;

public enum MPAARating {
    GeneralAudiance("G"),
    ParentalGuidanceSuggest("PG"),
    ParentsStronglyCautioned("PG-13"),
    Restricted("R"),
    AdultsOnly("NC-17");

    @Getter
    private String code;
    MPAARating(String code) {
        this.code = code;
    }
}
