package com.example.caservice.constants;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public final class ProjectConstants {

	public static final String DEFAULT_ENCODING = String.valueOf(StandardCharsets.UTF_8);
	public static final Locale TURKISH_LOCALE = new Locale.Builder().setLanguage("tr").setRegion("TR").build();

	private ProjectConstants() {
		throw new UnsupportedOperationException();
	}

}