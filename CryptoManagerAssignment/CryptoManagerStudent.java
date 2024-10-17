
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerStudent {
	CryptoManager cryptoManager;

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
    public void testEncryptCaesar() {
        assertEquals("ILZQIV(KIZZI[KW", CryptoManager.caesarEncryption("ADRIAN CARRASCO", 8));
        assertEquals("FRZER\\#EHERS", CryptoManager.caesarEncryption("COWBOY BEBOP", 3));
        assertEquals("XYWFNLMY%MFNW", CryptoManager.caesarEncryption("STRAIGHT HAIR", 5));
        assertEquals("XIP!MFU!UIF!EPHT!PVU", CryptoManager.caesarEncryption("WHO LET THE DOGS OUT", 1));
    }

    @Test
    public void testDecryptCaesar() {
        assertEquals("ADRIAN CARRASCO", CryptoManager.caesarDecryption("ILZQIV(KIZZI[KW", 8));
        assertEquals("COWBOY BEBOP", CryptoManager.caesarDecryption("FRZER\\#EHERS", 3));
        assertEquals("STRAIGHT HAIR", CryptoManager.caesarDecryption("XYWFNLMY%MFNW", 5));
        assertEquals("WHO LET THE DOGS OUT", CryptoManager.caesarDecryption("XIP!MFU!UIF!EPHT!PVU", 1));
    }

    @Test
    public void testEncryptBellaso() {
        assertEquals("QS%QQ]3KQ!%I#R\"", CryptoManager.bellasoEncryption("ADRIAN CARRASCO", "POSH"));
        assertEquals("WP#M#Z,MYC[[", CryptoManager.bellasoEncryption("COWBOY BEBOP", "TALK"));
        assertEquals(" YWURUO!%MUR ", CryptoManager.bellasoEncryption("STRAIGHT HAIR", "MEETING"));
        assertEquals("*]X4_X))([X5M#Z&5X)'", CryptoManager.bellasoEncryption("WHO LET THE DOGS OUT", "SUITS"));
    }

    @Test
    public void testDecryptBellaso() {
        assertEquals("ADRIAN CARRASCO", CryptoManager.bellasoDecryption("QS%QQ]3KQ!%I#R\"", "POSH"));
        assertEquals("COWBOY BEBOP", CryptoManager.bellasoDecryption("WP#M#Z,MYC[[", "TALK"));
        assertEquals("STRAIGHT HAIR", CryptoManager.bellasoDecryption(" YWURUO!%MUR ", "MEETING"));
        assertEquals("WHO LET THE DOGS OUT", CryptoManager.bellasoDecryption("*]X4_X))([X5M#Z&5X)'", "SUITS"));
    }

}
