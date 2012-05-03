package org.stormcat.jvbeans.jvlink.definitions;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import org.stormcat.jvbeans.config.RecordTypeId;
import org.stormcat.jvbeans.config.condition.OpenCondition;
import org.stormcat.jvbeans.jvlink.JvBindingDto;
import org.stormcat.jvbeans.jvlink.JvComponentInjector;
import org.stormcat.jvbeans.jvlink.analyze.JvBindingDtoFactory;
import org.stormcat.jvbeans.jvlink.definitions.dto.OwnerMasterDto;
import org.stormcat.jvbeans.jvlink.definitions.resolver.StoredDataResolver;

public class BindTest {
	
	private static final JvBindingDtoFactory dtoFactory;
	
	static {
		JvComponentInjector.init("org.stormcat.jvbeans.jvlink.definitions.dto");
		dtoFactory = JvComponentInjector.getSingletonFactory();		
	}
	
	private List<String> read(OpenCondition<? extends JvBindingDto> condition) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File(String.format("src/test/resources/org/stormcat/jvbeans/jvlink/definitions/%s.txt", condition.getRecordTypeId().getValue())));
			return IOUtils.readLines(fis, "MS932");
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.closeQuietly(fis);
		}
	}

	
	@Test
	public void TK() {
		doTest(StoredDataResolver._TOKU()._TK());
	}
	
	@Test
	public void BN() {
		doTest(StoredDataResolver._DIFF()._BN());
	}
	
	@Test
	public void BR() {
		doTest(StoredDataResolver._DIFF()._BR());
	}
	
	@Test
	public void CH() {
		doTest(StoredDataResolver._DIFF()._CH());
	}
	
	@Test
	public void KS() {
		doTest(StoredDataResolver._DIFF()._KS());
	}
	
	@Test
	public void RA() {
		doTest(StoredDataResolver._DIFF()._RA());
	}
	
	@Test
	public void RC() {
		doTest(StoredDataResolver._DIFF()._RC());
	}
	
	@Test
	public void SE() {
		doTest(StoredDataResolver._DIFF()._SE());
	}
	
	@Test
	public void UM() {
		doTest(StoredDataResolver._DIFF()._UM());
	}
	
	@Test
	public void H1() {
		doTest(StoredDataResolver._RACE()._H1());
	}
	
	@Test
	public void H6() {
		doTest(StoredDataResolver._RACE()._H6());
	}
	
	@Test
	public void HR() {
		doTest(StoredDataResolver._RACE()._HR());
	}

	@Test
	public void WF() {
		doTest(StoredDataResolver._RACE()._WF());
	}
	
	@Test
	public void JG() {
		doTest(StoredDataResolver._RACE()._JG());
	}
	
	@Test
	public void O1() {
		doTest(StoredDataResolver._RACE()._O1());
	}
	
	@Test
	public void O2() {
		doTest(StoredDataResolver._RACE()._O2());
	}
	
	@Test
	public void O3() {
		doTest(StoredDataResolver._RACE()._O3());
	}
	
	@Test
	public void O4() {
		doTest(StoredDataResolver._RACE()._O4());
	}
	
	@Test
	public void O5() {
		doTest(StoredDataResolver._RACE()._O5());
	}
	
	@Test
	public void O6() {
		doTest(StoredDataResolver._RACE()._O6());
	}
	
	@Test
	public void BT() {
		doTest(StoredDataResolver._BLOD()._BT());
	}
	
	@Test
	public void HN() {
		doTest(StoredDataResolver._BLOD()._HN());
	}
	
	@Test
	public void SK() {
		doTest(StoredDataResolver._BLOD()._SK());
	}
	
	@Test
	public void DM() {
		doTest(StoredDataResolver._MING()._DM());
	}
	
	@Test
	public void TM() {
		doTest(StoredDataResolver._MING()._TM());
	}
	
	@Test
	public void CK() {
		doTest(StoredDataResolver._SNAP()._CK());
	}	
	
	@Test
	public void HC() {
		doTest(StoredDataResolver._SLOP()._HC());
	}
	
	@Test
	public void YS() {
		doTest(StoredDataResolver._YSCH()._YS());
	}
	
	@Test
	public void HS() {
		doTest(StoredDataResolver._HOSE()._HS());
	}
	
	@Test
	public void HY() {
		doTest(StoredDataResolver._HOYU()._HY());
	}
	
	@Test
	public void CS() {
		doTest(StoredDataResolver._COMM()._CS());
	}
	
	
	private void doTest(OpenCondition<? extends JvBindingDto> condition) {
		for (String line : read(condition)) {
			try {
				JvBindingDto dto = dtoFactory.create(line, condition);
				System.out.println(dto.toString());
			} catch (Exception e) {
				fail(e.getMessage());
			}
		}		
	}
}
