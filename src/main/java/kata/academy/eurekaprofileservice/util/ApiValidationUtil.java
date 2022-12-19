package kata.academy.eurekaprofileservice.util;

import kata.academy.eurekaprofileservice.exception.RequestValidationException;

public final class ApiValidationUtil {

    public static void requireTrue(boolean value, String message) {
        if (!value) {
            throw new RequestValidationException(message);
        }
    }

    public static void requireFalse(boolean value, String message) {
        if (value) {
            throw new RequestValidationException(message);
        }
    }

    public static void requireNotNull(Object value, String message) {
        if (value == null) {
            throw new RequestValidationException(message);
        }
    }

    public static void requireNull(Object value, String message) {
        if (value != null) {
            throw new RequestValidationException(message);
        }
    }
}
