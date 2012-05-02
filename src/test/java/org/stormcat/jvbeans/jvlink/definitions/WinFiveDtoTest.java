package org.stormcat.jvbeans.jvlink.definitions;

import org.junit.Test;
import org.stormcat.jvbeans.config.DataOption;
import org.stormcat.jvbeans.jvlink.definitions.dto.WinFiveDto;
import org.stormcat.jvbeans.jvlink.definitions.resolver.StoredDataResolver;

public class WinFiveDtoTest extends DefinitionsTestBase<WinFiveDto> {

	@Test
	public void test() {
		storedTest(StoredDataResolver._RACE()._WF(), "20110401000000", DataOption.STANDARD);
	}

}
