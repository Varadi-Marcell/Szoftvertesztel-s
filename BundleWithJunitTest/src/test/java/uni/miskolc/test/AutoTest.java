package uni.miskolc.test;

import uni.miskolc.AjtokszamaNemMegfelelo;
import uni.miskolc.Auto;
import uni.miskolc.GyartasiIdoNemMegfelelo;
import uni.miskolc.RendszamNemMegfelelo;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.fail;

public class AutoTest {

	Auto testAuto;

	@Before
	public void initAuto() {
		testAuto = new Auto();
	}

	@Test
	public void testAjtokSzamaMegfelflo() throws AjtokszamaNemMegfelelo {
		Auto auto = new Auto();
		auto.setAjtokSzama(3);
	}

	@Test(expected = AjtokszamaNemMegfelelo.class)
	public void testAjtokSzamaTulAlacsony() throws AjtokszamaNemMegfelelo {
		Auto auto = new Auto();
		auto.setAjtokSzama(-1);
	}

	@Test(expected = AjtokszamaNemMegfelelo.class)
	public void testAjtokSzamaTulMagas() throws AjtokszamaNemMegfelelo {
		Auto auto = new Auto();
		auto.setAjtokSzama(1000);
	}

	@Test
	public void testJoRendszam() throws RendszamNemMegfelelo {
		Auto auto = new Auto();
		String rendszam = "ABC-123";
		auto.setRendszam(rendszam);
	}

	@Test(expected = RendszamNemMegfelelo.class)
	public void kotojelNelkuliRendszam() throws RendszamNemMegfelelo {
		String rendszam = "aaaaaaa";
		testAuto.setRendszam(rendszam);
	}

	@Test(expected = RendszamNemMegfelelo.class)
	public void testTulHosszuBetusRendszam() throws RendszamNemMegfelelo {
		String rendszam = "ABCA-123";
		testAuto.setRendszam(rendszam);
	}

	@Test(expected = RendszamNemMegfelelo.class)
	public void testTulHosszuSzamosRendszam() throws RendszamNemMegfelelo {
		String rendszam = "ABC-1234";
		testAuto.setRendszam(rendszam);
	}

	@Test(expected = RendszamNemMegfelelo.class)
	public void testCsakSzamokRendszam() throws RendszamNemMegfelelo {
		String rendszam = "111-123";
		testAuto.setRendszam(rendszam);
	}

	@Test(expected = RendszamNemMegfelelo.class)
	public void testCsakBetukRendszam() throws RendszamNemMegfelelo {
		String rendszam = "ABC-CBA";
		testAuto.setRendszam(rendszam);
	}

	@Test(expected = RendszamNemMegfelelo.class)
	public void testKisbetusRendszamRendszam() throws RendszamNemMegfelelo {
		String rendszam = "aaa-123";
		testAuto.setRendszam(rendszam);
	}

	@Test(expected = RendszamNemMegfelelo.class)
	public void testQBetusRendszam() throws RendszamNemMegfelelo {
		String rendszam = "AQE-123";
		testAuto.setRendszam(rendszam);
	}

	@Test
	public void testJoGyartasiIdo() throws GyartasiIdoNemMegfelelo {
		String gyartasiIdo = "2021-04-17";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}

	@Test(expected = GyartasiIdoNemMegfelelo.class)
	public void testKoraiGyartasiIdo() throws GyartasiIdoNemMegfelelo {
		String gyartasiIdo = "2500-10-31";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}

	@Test(expected = GyartasiIdoNemMegfelelo.class)
	public void testKesoiGyartasiIdo() throws GyartasiIdoNemMegfelelo {
		String gyartasiIdo = "1734-03-10";
		testAuto.setGyartasiIdo(LocalDate.parse(gyartasiIdo));
	}

	@Test
	public void testSzinkodSettet() {
		String szinkod = "#FFFFFF";
		testAuto.setSzinHex(szinkod);

	}

}