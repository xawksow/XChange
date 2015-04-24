package com.xeiam.xchange.cryptsy;

import java.util.HashMap;
import java.util.Map;

import com.xeiam.xchange.currency.CurrencyPair;

/**
 * @author ObsessiveOrange
 */
public final class CryptsyCurrencyUtils {

	/**
	 * Map containing relationships between MarketIds and CurrencyPairs CAA: 27
	 * June 2014 This list is not final, since CryptsyBasePollingService will
	 * update it on first run.
	 */
	@SuppressWarnings("serial")
	public static Map<Integer, CurrencyPair> marketIds_CurrencyPairs = new HashMap<Integer, CurrencyPair>() {

		{
			put(141, new CurrencyPair("42", "BTC"));
			put(199, new CurrencyPair("AC", "BTC"));
			put(253, new CurrencyPair("AGS", "BTC"));
			put(57, new CurrencyPair("ALF", "BTC"));
			put(273, new CurrencyPair("ALN", "BTC"));
			put(43, new CurrencyPair("AMC", "BTC"));
			put(66, new CurrencyPair("ANC", "BTC"));
			put(257, new CurrencyPair("APEX", "BTC"));
			put(48, new CurrencyPair("ARG", "BTC"));
			put(160, new CurrencyPair("AUR", "BTC"));
			put(179, new CurrencyPair("BC", "BTC"));
			put(142, new CurrencyPair("BCX", "BTC"));
			put(157, new CurrencyPair("BEN", "BTC"));
			put(129, new CurrencyPair("BET", "BTC"));
			put(251, new CurrencyPair("BLU", "BTC"));
			put(10, new CurrencyPair("BQC", "BTC"));
			put(23, new CurrencyPair("BTB", "BTC"));
			put(256, new CurrencyPair("BTCD", "BTC"));
			put(49, new CurrencyPair("BTE", "BTC"));
			put(50, new CurrencyPair("BTG", "BTC"));
			put(102, new CurrencyPair("BUK", "BTC"));
			put(154, new CurrencyPair("CACH", "BTC"));
			put(221, new CurrencyPair("CAIx", "BTC"));
			put(53, new CurrencyPair("CAP", "BTC"));
			put(150, new CurrencyPair("CASH", "BTC"));
			put(136, new CurrencyPair("CAT", "BTC"));
			put(70, new CurrencyPair("CGB", "BTC"));
			put(197, new CurrencyPair("CINNI", "BTC"));
			put(227, new CurrencyPair("CLOAK", "BTC"));
			put(95, new CurrencyPair("CLR", "BTC"));
			put(74, new CurrencyPair("CMC", "BTC"));
			put(8, new CurrencyPair("CNC", "BTC"));
			put(260, new CurrencyPair("CNL", "BTC"));
			put(198, new CurrencyPair("COMM", "BTC"));
			put(266, new CurrencyPair("COOL", "BTC"));
			put(58, new CurrencyPair("CRC", "BTC"));
			put(219, new CurrencyPair("CRYPT", "BTC"));
			put(68, new CurrencyPair("CSC", "BTC"));
			put(131, new CurrencyPair("DEM", "BTC"));
			put(167, new CurrencyPair("DGB", "BTC"));
			put(26, new CurrencyPair("DGC", "BTC"));
			put(72, new CurrencyPair("DMD", "BTC"));
			put(132, new CurrencyPair("DOGE", "BTC"));
			put(155, new CurrencyPair("DRK", "BTC"));
			put(274, new CurrencyPair("DRKC", "BTC"));
			put(40, new CurrencyPair("DVC", "BTC"));
			put(139, new CurrencyPair("EAC", "BTC"));
			put(12, new CurrencyPair("ELC", "BTC"));
			put(188, new CurrencyPair("EMC2", "BTC"));
			put(69, new CurrencyPair("EMD", "BTC"));
			put(183, new CurrencyPair("EXE", "BTC"));
			put(47, new CurrencyPair("EZC", "BTC"));
			put(138, new CurrencyPair("FFC", "BTC"));
			put(192, new CurrencyPair("FLT", "BTC"));
			put(259, new CurrencyPair("FRAC", "BTC"));
			put(39, new CurrencyPair("FRC", "BTC"));
			put(33, new CurrencyPair("FRK", "BTC"));
			put(44, new CurrencyPair("FST", "BTC"));
			put(5, new CurrencyPair("FTC", "BTC"));
			put(82, new CurrencyPair("GDC", "BTC"));
			put(76, new CurrencyPair("GLC", "BTC"));
			put(30, new CurrencyPair("GLD", "BTC"));
			put(78, new CurrencyPair("GLX", "BTC"));
			put(229, new CurrencyPair("GLYPH", "BTC"));
			put(241, new CurrencyPair("GUE", "BTC"));
			put(80, new CurrencyPair("HBN", "BTC"));
			put(249, new CurrencyPair("HUC", "BTC"));
			put(185, new CurrencyPair("HVC", "BTC"));
			put(267, new CurrencyPair("ICB", "BTC"));
			put(59, new CurrencyPair("IFC", "BTC"));
			put(272, new CurrencyPair("IOC", "BTC"));
			put(38, new CurrencyPair("IXC", "BTC"));
			put(25, new CurrencyPair("JKC", "BTC"));
			put(269, new CurrencyPair("JUDGE", "BTC"));
			put(178, new CurrencyPair("KDC", "BTC"));
			put(255, new CurrencyPair("KEY", "BTC"));
			put(65, new CurrencyPair("KGC", "BTC"));
			put(204, new CurrencyPair("LGD", "BTC"));
			put(116, new CurrencyPair("LK7", "BTC"));
			put(34, new CurrencyPair("LKY", "BTC"));
			put(202, new CurrencyPair("LTB", "BTC"));
			put(3, new CurrencyPair("LTC", "BTC"));
			put(233, new CurrencyPair("LTCX", "BTC"));
			put(177, new CurrencyPair("LYC", "BTC"));
			put(152, new CurrencyPair("MAX", "BTC"));
			put(45, new CurrencyPair("MEC", "BTC"));
			put(258, new CurrencyPair("MIN", "BTC"));
			put(156, new CurrencyPair("MINT", "BTC"));
			put(187, new CurrencyPair("MN1", "BTC"));
			put(196, new CurrencyPair("MN2", "BTC"));
			put(7, new CurrencyPair("MNC", "BTC"));
			put(189, new CurrencyPair("MRY", "BTC"));
			put(200, new CurrencyPair("MYR", "BTC"));
			put(164, new CurrencyPair("MZC", "BTC"));
			put(64, new CurrencyPair("NAN", "BTC"));
			put(207, new CurrencyPair("NAUT", "BTC"));
			put(252, new CurrencyPair("NAV", "BTC"));
			put(32, new CurrencyPair("NBL", "BTC"));
			put(90, new CurrencyPair("NEC", "BTC"));
			put(134, new CurrencyPair("NET", "BTC"));
			put(29, new CurrencyPair("NMC", "BTC"));
			put(264, new CurrencyPair("NOBL", "BTC"));
			put(54, new CurrencyPair("NRB", "BTC"));
			put(211, new CurrencyPair("NRS", "BTC"));
			put(13, new CurrencyPair("NVC", "BTC"));
			put(159, new CurrencyPair("NXT", "BTC"));
			put(184, new CurrencyPair("NYAN", "BTC"));
			put(75, new CurrencyPair("ORB", "BTC"));
			put(144, new CurrencyPair("OSC", "BTC"));
			put(86, new CurrencyPair("PHS", "BTC"));
			put(120, new CurrencyPair("Points", "BTC"));
			put(173, new CurrencyPair("POT", "BTC"));
			put(28, new CurrencyPair("PPC", "BTC"));
			put(268, new CurrencyPair("PSEUD", "BTC"));
			put(119, new CurrencyPair("PTS", "BTC"));
			put(31, new CurrencyPair("PXC", "BTC"));
			put(92, new CurrencyPair("PYC", "BTC"));
			put(71, new CurrencyPair("QRK", "BTC"));
			put(169, new CurrencyPair("RDD", "BTC"));
			put(143, new CurrencyPair("RPC", "BTC"));
			put(235, new CurrencyPair("RT2", "BTC"));
			put(9, new CurrencyPair("RYC", "BTC"));
			put(237, new CurrencyPair("RZR", "BTC"));
			put(232, new CurrencyPair("SAT2", "BTC"));
			put(51, new CurrencyPair("SBC", "BTC"));
			put(225, new CurrencyPair("SC", "BTC"));
			put(270, new CurrencyPair("SFR", "BTC"));
			put(248, new CurrencyPair("SHLD", "BTC"));
			put(158, new CurrencyPair("SMC", "BTC"));
			put(180, new CurrencyPair("SPA", "BTC"));
			put(81, new CurrencyPair("SPT", "BTC"));
			put(88, new CurrencyPair("SRC", "BTC"));
			put(83, new CurrencyPair("STR", "BTC"));
			put(239, new CurrencyPair("SUPER", "BTC"));
			put(153, new CurrencyPair("SXC", "BTC"));
			put(271, new CurrencyPair("SYNC", "BTC"));
			put(117, new CurrencyPair("TAG", "BTC"));
			put(166, new CurrencyPair("TAK", "BTC"));
			put(114, new CurrencyPair("TEK", "BTC"));
			put(223, new CurrencyPair("TES", "BTC"));
			put(130, new CurrencyPair("TGC", "BTC"));
			put(250, new CurrencyPair("TOR", "BTC"));
			put(27, new CurrencyPair("TRC", "BTC"));
			put(203, new CurrencyPair("UNB", "BTC"));
			put(133, new CurrencyPair("UNO", "BTC"));
			put(247, new CurrencyPair("URO", "BTC"));
			put(201, new CurrencyPair("USDe", "BTC"));
			put(163, new CurrencyPair("UTC", "BTC"));
			put(261, new CurrencyPair("VIA", "BTC"));
			put(254, new CurrencyPair("VOOT", "BTC"));
			put(209, new CurrencyPair("VRC", "BTC"));
			put(151, new CurrencyPair("VTC", "BTC"));
			put(195, new CurrencyPair("WC", "BTC"));
			put(14, new CurrencyPair("WDC", "BTC"));
			put(210, new CurrencyPair("XC", "BTC"));
			put(115, new CurrencyPair("XJO", "BTC"));
			put(208, new CurrencyPair("XLB", "BTC"));
			put(63, new CurrencyPair("XPM", "BTC"));
			put(265, new CurrencyPair("XXX", "BTC"));
			put(11, new CurrencyPair("YAC", "BTC"));
			put(73, new CurrencyPair("YBC", "BTC"));
			put(140, new CurrencyPair("ZCC", "BTC"));
			put(170, new CurrencyPair("ZED", "BTC"));
			put(85, new CurrencyPair("ZET", "BTC"));
			put(94, new CurrencyPair("ADT", "LTC"));
			put(121, new CurrencyPair("ANC", "LTC"));
			put(111, new CurrencyPair("ASC", "LTC"));
			put(161, new CurrencyPair("AUR", "LTC"));
			put(186, new CurrencyPair("BAT", "LTC"));
			put(191, new CurrencyPair("BC", "LTC"));
			put(123, new CurrencyPair("CGB", "LTC"));
			put(228, new CurrencyPair("CLOAK", "LTC"));
			put(17, new CurrencyPair("CNC", "LTC"));
			put(109, new CurrencyPair("COL", "LTC"));
			put(91, new CurrencyPair("CPR", "LTC"));
			put(220, new CurrencyPair("CRYPT", "LTC"));
			put(175, new CurrencyPair("CTM", "LTC"));
			put(46, new CurrencyPair("DBL", "LTC"));
			put(96, new CurrencyPair("DGC", "LTC"));
			put(206, new CurrencyPair("DIME", "LTC"));
			put(194, new CurrencyPair("DMC", "LTC"));
			put(135, new CurrencyPair("DOGE", "LTC"));
			put(214, new CurrencyPair("DRK", "LTC"));
			put(52, new CurrencyPair("DVC", "LTC"));
			put(244, new CurrencyPair("EAC", "LTC"));
			put(93, new CurrencyPair("ELP", "LTC"));
			put(55, new CurrencyPair("EZC", "LTC"));
			put(246, new CurrencyPair("FLAP", "LTC"));
			put(61, new CurrencyPair("FLO", "LTC"));
			put(171, new CurrencyPair("FRK", "LTC"));
			put(124, new CurrencyPair("FST", "LTC"));
			put(4, new CurrencyPair("FTC", "LTC"));
			put(36, new CurrencyPair("GLD", "LTC"));
			put(230, new CurrencyPair("GLYPH", "LTC"));
			put(84, new CurrencyPair("GME", "LTC"));
			put(242, new CurrencyPair("GUE", "LTC"));
			put(60, new CurrencyPair("IFC", "LTC"));
			put(193, new CurrencyPair("KARM", "LTC"));
			put(245, new CurrencyPair("LEAF", "LTC"));
			put(243, new CurrencyPair("LOT", "LTC"));
			put(234, new CurrencyPair("LTCX", "LTC"));
			put(218, new CurrencyPair("MAX", "LTC"));
			put(100, new CurrencyPair("MEC", "LTC"));
			put(56, new CurrencyPair("MEM", "LTC"));
			put(231, new CurrencyPair("MEOW", "LTC"));
			put(145, new CurrencyPair("MOON", "LTC"));
			put(62, new CurrencyPair("MST", "LTC"));
			put(108, new CurrencyPair("NET", "LTC"));
			put(162, new CurrencyPair("NXT", "LTC"));
			put(263, new CurrencyPair("NYAN", "LTC"));
			put(125, new CurrencyPair("PPC", "LTC"));
			put(101, new CurrencyPair("PXC", "LTC"));
			put(126, new CurrencyPair("QRK", "LTC"));
			put(190, new CurrencyPair("RBBT", "LTC"));
			put(212, new CurrencyPair("RDD", "LTC"));
			put(87, new CurrencyPair("RED", "LTC"));
			put(238, new CurrencyPair("RZR", "LTC"));
			put(128, new CurrencyPair("SBC", "LTC"));
			put(240, new CurrencyPair("SUPER", "LTC"));
			put(98, new CurrencyPair("SXC", "LTC"));
			put(224, new CurrencyPair("TES", "LTC"));
			put(147, new CurrencyPair("TIPS", "LTC"));
			put(107, new CurrencyPair("TIX", "LTC"));
			put(215, new CurrencyPair("VRC", "LTC"));
			put(217, new CurrencyPair("VTC", "LTC"));
			put(21, new CurrencyPair("WDC", "LTC"));
			put(216, new CurrencyPair("XC", "LTC"));
			put(67, new CurrencyPair("XNC", "LTC"));
			put(106, new CurrencyPair("XPM", "LTC"));
			put(22, new CurrencyPair("YAC", "LTC"));
			put(176, new CurrencyPair("ZEIT", "LTC"));
			put(127, new CurrencyPair("ZET", "LTC"));
			put(2, new CurrencyPair("BTC", "USD"));
			put(182, new CurrencyPair("DOGE", "USD"));
			put(213, new CurrencyPair("DRK", "USD"));
			put(6, new CurrencyPair("FTC", "USD"));
			put(1, new CurrencyPair("LTC", "USD"));
			put(294, new CurrencyPair("LTCD", "BTC"));
			put(262, new CurrencyPair("RDD", "USD"));
			put(345, new CurrencyPair("42","XRP"));
			put(342, new CurrencyPair("AC","XRP"));
			put(371, new CurrencyPair("AERO","XRP"));
			put(382, new CurrencyPair("ALN","XRP"));
			put(317, new CurrencyPair("ANC","XRP"));
			put(433, new CurrencyPair("APEX","XRP"));
			put(339, new CurrencyPair("ARG","XRP"));
			put(338, new CurrencyPair("AUR","XRP"));
			put(323, new CurrencyPair("BLK","XRP"));
			put(395, new CurrencyPair("BLU","XRP"));
			put(398, new CurrencyPair("BTB","XRP"));
			put(316, new CurrencyPair("BTCD","XRP"));
			put(421, new CurrencyPair("BTG","XRP"));
			put(360, new CurrencyPair("BTM","XRP"));
			put(358, new CurrencyPair("CANN","XRP"));
			put(410, new CurrencyPair("CAP","XRP"));
			put(414, new CurrencyPair("CBX","XRP"));
			put(452, new CurrencyPair("CENT","XRP"));
			put(346, new CurrencyPair("CKC","XRP"));
			put(318, new CurrencyPair("CLOAK","XRP"));
			put(435, new CurrencyPair("CLR","XRP"));
			put(402, new CurrencyPair("CNC","XRP"));
			put(376, new CurrencyPair("COL","XRP"));
			put(427, new CurrencyPair("CRACK","XRP"));
			put(411, new CurrencyPair("CRAIG","XRP"));
			put(378, new CurrencyPair("CRYPT","XRP"));
			put(313, new CurrencyPair("DASH","XRP"));
			put(364, new CurrencyPair("DEM","XRP"));
			put(330, new CurrencyPair("DGB","XRP"));
			put(356, new CurrencyPair("DGC","XRP"));
			put(352, new CurrencyPair("DMD","XRP"));
			put(311, new CurrencyPair("DOGE","XRP"));
			put(341, new CurrencyPair("DRKC","XRP"));
			put(425, new CurrencyPair("DT","XRP"));
			put(396, new CurrencyPair("DVC","XRP"));
			put(417, new CurrencyPair("EAC","XRP"));
			put(405, new CurrencyPair("EMC2","XRP"));
			put(430, new CurrencyPair("EXE","XRP"));
			put(393, new CurrencyPair("FFC","XRP"));
			put(321, new CurrencyPair("FIBRE","XRP"));
			put(391, new CurrencyPair("FLAP","XRP"));
			put(383, new CurrencyPair("FLO","XRP"));
			put(369, new CurrencyPair("FLT","XRP"));
			put(424, new CurrencyPair("FRC","XRP"));
			put(372, new CurrencyPair("FRK","XRP"));
			put(400, new CurrencyPair("GB","XRP"));
			put(413, new CurrencyPair("GLD","XRP"));
			put(366, new CurrencyPair("GLYPH","XRP"));
			put(359, new CurrencyPair("HAL","XRP"));
			put(367, new CurrencyPair("HBN","XRP"));
			put(450, new CurrencyPair("HTML5","XRP"));
			put(418, new CurrencyPair("HUC","XRP"));
			put(412, new CurrencyPair("HVC","XRP"));
			put(397, new CurrencyPair("ICB","XRP"));
			put(340, new CurrencyPair("IFC","XRP"));
			put(385, new CurrencyPair("IOC","XRP"));
			put(351, new CurrencyPair("IXC","XRP"));
			put(429, new CurrencyPair("JUDGE","XRP"));
			put(380, new CurrencyPair("KARM","XRP"));
			put(401, new CurrencyPair("KEY","XRP"));
			put(436, new CurrencyPair("LEAF","XRP"));
			put(438, new CurrencyPair("LKY","XRP"));
			put(392, new CurrencyPair("LOT","XRP"));
			put(407, new CurrencyPair("LSD","XRP"));
			put(390, new CurrencyPair("LTB","XRP"));
			put(320, new CurrencyPair("LTCD","XRP"));
			put(328, new CurrencyPair("LXC","XRP"));
			put(370, new CurrencyPair("MAX","XRP"));
			put(337, new CurrencyPair("MEC","XRP"));
			put(434, new CurrencyPair("MEOW","XRP"));
			put(432, new CurrencyPair("MINT","XRP"));
			put(437, new CurrencyPair("MNC","XRP"));
			put(347, new CurrencyPair("MOON","XRP"));
			put(403, new CurrencyPair("MRY","XRP"));
			put(333, new CurrencyPair("MYR","XRP"));
			put(348, new CurrencyPair("MZC","XRP"));
			put(384, new CurrencyPair("NAUT","XRP"));
			put(431, new CurrencyPair("NAV","XRP"));
			put(439, new CurrencyPair("NEC","XRP"));
			put(420, new CurrencyPair("NET","XRP"));
			put(426, new CurrencyPair("NMB","XRP"));
			put(334, new CurrencyPair("NMC","XRP"));
			put(349, new CurrencyPair("NVC","XRP"));
			put(362, new CurrencyPair("OPAL","XRP"));
			put(419, new CurrencyPair("ORB","XRP"));
			put(406, new CurrencyPair("OSC","XRP"));
			put(423, new CurrencyPair("PHS","XRP"));
			put(327, new CurrencyPair("POT","XRP"));
			put(325, new CurrencyPair("PTS","XRP"));
			put(379, new CurrencyPair("PXC","XRP"));
			put(344, new CurrencyPair("QRK","XRP"));
			put(353, new CurrencyPair("RZR","XRP"));
			put(428, new CurrencyPair("SDC","XRP"));
			put(409, new CurrencyPair("SFR","XRP"));
			put(408, new CurrencyPair("SHADE","XRP"));
			put(415, new CurrencyPair("SILK","XRP"));
			put(361, new CurrencyPair("SLG","XRP"));
			put(386, new CurrencyPair("SPA","XRP"));
			put(389, new CurrencyPair("SRC","XRP"));
			put(375, new CurrencyPair("SSV","XRP"));
			put(373, new CurrencyPair("SUPER","XRP"));
			put(422, new CurrencyPair("SXC","XRP"));
			put(365, new CurrencyPair("SYS","XRP"));
			put(374, new CurrencyPair("TAG","XRP"));
			put(363, new CurrencyPair("TEK","XRP"));
			put(388, new CurrencyPair("TES","XRP"));
			put(368, new CurrencyPair("TIPS","XRP"));
			put(350, new CurrencyPair("TRC","XRP"));
			put(404, new CurrencyPair("UNB","XRP"));
			put(314, new CurrencyPair("UNO","XRP"));
			put(381, new CurrencyPair("URO","XRP"));
			put(394, new CurrencyPair("USDe","XRP"));
			put(354, new CurrencyPair("UTC","XRP"));
			put(343, new CurrencyPair("VIA","XRP"));
			put(331, new CurrencyPair("VRC","XRP"));
			put(335, new CurrencyPair("VTC","XRP"));
			put(336, new CurrencyPair("WC","XRP"));
			put(332, new CurrencyPair("WDC","XRP"));
			put(416, new CurrencyPair("XBOT","XRP"));
			put(329, new CurrencyPair("XC","XRP"));
			put(387, new CurrencyPair("XCR","XRP"));
			put(357, new CurrencyPair("XPM","XRP"));
			put(319, new CurrencyPair("XST","XRP"));
			put(377, new CurrencyPair("XXX","XRP"));
			put(440, new CurrencyPair("YAC","XRP"));
			put(399, new CurrencyPair("ZEIT","XRP"));
			put(326, new CurrencyPair("ZET","XRP"));
		}
	};

	/**
	 * Map containing relationships between MarketIds and CurrencyPairs CAA: 27
	 * June 2014 This list is not final, since CryptsyBasePollingService will
	 * update it on first run.
	 */
	@SuppressWarnings("serial")
	public static Map<CurrencyPair, Integer> currencyPairs_MarketIds = new HashMap<CurrencyPair, Integer>() {

		{
			put(new CurrencyPair("42", "BTC"), 141);
			put(new CurrencyPair("AC", "BTC"), 199);
			put(new CurrencyPair("AGS", "BTC"), 253);
			put(new CurrencyPair("ALF", "BTC"), 57);
			put(new CurrencyPair("ALN", "BTC"), 273);
			put(new CurrencyPair("AMC", "BTC"), 43);
			put(new CurrencyPair("ANC", "BTC"), 66);
			put(new CurrencyPair("APEX", "BTC"), 257);
			put(new CurrencyPair("ARG", "BTC"), 48);
			put(new CurrencyPair("AUR", "BTC"), 160);
			put(new CurrencyPair("BC", "BTC"), 179);
			put(new CurrencyPair("BCX", "BTC"), 142);
			put(new CurrencyPair("BEN", "BTC"), 157);
			put(new CurrencyPair("BET", "BTC"), 129);
			put(new CurrencyPair("BLU", "BTC"), 251);
			put(new CurrencyPair("BQC", "BTC"), 10);
			put(new CurrencyPair("BTB", "BTC"), 23);
			put(new CurrencyPair("BTCD", "BTC"), 256);
			put(new CurrencyPair("BTE", "BTC"), 49);
			put(new CurrencyPair("BTG", "BTC"), 50);
			put(new CurrencyPair("BUK", "BTC"), 102);
			put(new CurrencyPair("CACH", "BTC"), 154);
			put(new CurrencyPair("CAIx", "BTC"), 221);
			put(new CurrencyPair("CAP", "BTC"), 53);
			put(new CurrencyPair("CASH", "BTC"), 150);
			put(new CurrencyPair("CAT", "BTC"), 136);
			put(new CurrencyPair("CGB", "BTC"), 70);
			put(new CurrencyPair("CINNI", "BTC"), 197);
			put(new CurrencyPair("CLOAK", "BTC"), 227);
			put(new CurrencyPair("CLR", "BTC"), 95);
			put(new CurrencyPair("CMC", "BTC"), 74);
			put(new CurrencyPair("CNC", "BTC"), 8);
			put(new CurrencyPair("CNL", "BTC"), 260);
			put(new CurrencyPair("COMM", "BTC"), 198);
			put(new CurrencyPair("COOL", "BTC"), 266);
			put(new CurrencyPair("CRC", "BTC"), 58);
			put(new CurrencyPair("CRYPT", "BTC"), 219);
			put(new CurrencyPair("CSC", "BTC"), 68);
			put(new CurrencyPair("DEM", "BTC"), 131);
			put(new CurrencyPair("DGB", "BTC"), 167);
			put(new CurrencyPair("DGC", "BTC"), 26);
			put(new CurrencyPair("DMD", "BTC"), 72);
			put(new CurrencyPair("DOGE", "BTC"), 132);
			put(new CurrencyPair("DRK", "BTC"), 155);
			put(new CurrencyPair("DRKC", "BTC"), 274);
			put(new CurrencyPair("DVC", "BTC"), 40);
			put(new CurrencyPair("EAC", "BTC"), 139);
			put(new CurrencyPair("ELC", "BTC"), 12);
			put(new CurrencyPair("EMC2", "BTC"), 188);
			put(new CurrencyPair("EMD", "BTC"), 69);
			put(new CurrencyPair("EXE", "BTC"), 183);
			put(new CurrencyPair("EZC", "BTC"), 47);
			put(new CurrencyPair("FFC", "BTC"), 138);
			put(new CurrencyPair("FLT", "BTC"), 192);
			put(new CurrencyPair("FRAC", "BTC"), 259);
			put(new CurrencyPair("FRC", "BTC"), 39);
			put(new CurrencyPair("FRK", "BTC"), 33);
			put(new CurrencyPair("FST", "BTC"), 44);
			put(new CurrencyPair("FTC", "BTC"), 5);
			put(new CurrencyPair("GDC", "BTC"), 82);
			put(new CurrencyPair("GLC", "BTC"), 76);
			put(new CurrencyPair("GLD", "BTC"), 30);
			put(new CurrencyPair("GLX", "BTC"), 78);
			put(new CurrencyPair("GLYPH", "BTC"), 229);
			put(new CurrencyPair("GUE", "BTC"), 241);
			put(new CurrencyPair("HBN", "BTC"), 80);
			put(new CurrencyPair("HUC", "BTC"), 249);
			put(new CurrencyPair("HVC", "BTC"), 185);
			put(new CurrencyPair("ICB", "BTC"), 267);
			put(new CurrencyPair("IFC", "BTC"), 59);
			put(new CurrencyPair("IOC", "BTC"), 272);
			put(new CurrencyPair("IXC", "BTC"), 38);
			put(new CurrencyPair("JKC", "BTC"), 25);
			put(new CurrencyPair("JUDGE", "BTC"), 269);
			put(new CurrencyPair("KDC", "BTC"), 178);
			put(new CurrencyPair("KEY", "BTC"), 255);
			put(new CurrencyPair("KGC", "BTC"), 65);
			put(new CurrencyPair("LGD", "BTC"), 204);
			put(new CurrencyPair("LK7", "BTC"), 116);
			put(new CurrencyPair("LKY", "BTC"), 34);
			put(new CurrencyPair("LTB", "BTC"), 202);
			put(new CurrencyPair("LTC", "BTC"), 3);
			put(new CurrencyPair("LTCD", "BTC"), 294);
			put(new CurrencyPair("LTCX", "BTC"), 233);
			put(new CurrencyPair("LYC", "BTC"), 177);
			put(new CurrencyPair("MAX", "BTC"), 152);
			put(new CurrencyPair("MEC", "BTC"), 45);
			put(new CurrencyPair("MIN", "BTC"), 258);
			put(new CurrencyPair("MINT", "BTC"), 156);
			put(new CurrencyPair("MN1", "BTC"), 187);
			put(new CurrencyPair("MN2", "BTC"), 196);
			put(new CurrencyPair("MNC", "BTC"), 7);
			put(new CurrencyPair("MRY", "BTC"), 189);
			put(new CurrencyPair("MYR", "BTC"), 200);
			put(new CurrencyPair("MZC", "BTC"), 164);
			put(new CurrencyPair("NAN", "BTC"), 64);
			put(new CurrencyPair("NAUT", "BTC"), 207);
			put(new CurrencyPair("NAV", "BTC"), 252);
			put(new CurrencyPair("NBL", "BTC"), 32);
			put(new CurrencyPair("NEC", "BTC"), 90);
			put(new CurrencyPair("NET", "BTC"), 134);
			put(new CurrencyPair("NMC", "BTC"), 29);
			put(new CurrencyPair("NOBL", "BTC"), 264);
			put(new CurrencyPair("NRB", "BTC"), 54);
			put(new CurrencyPair("NRS", "BTC"), 211);
			put(new CurrencyPair("NVC", "BTC"), 13);
			put(new CurrencyPair("NXT", "BTC"), 159);
			put(new CurrencyPair("NYAN", "BTC"), 184);
			put(new CurrencyPair("ORB", "BTC"), 75);
			put(new CurrencyPair("OSC", "BTC"), 144);
			put(new CurrencyPair("PHS", "BTC"), 86);
			put(new CurrencyPair("Points", "BTC"), 120);
			put(new CurrencyPair("POT", "BTC"), 173);
			put(new CurrencyPair("PPC", "BTC"), 28);
			put(new CurrencyPair("PSEUD", "BTC"), 268);
			put(new CurrencyPair("PTS", "BTC"), 119);
			put(new CurrencyPair("PXC", "BTC"), 31);
			put(new CurrencyPair("PYC", "BTC"), 92);
			put(new CurrencyPair("QRK", "BTC"), 71);
			put(new CurrencyPair("RDD", "BTC"), 169);
			put(new CurrencyPair("RPC", "BTC"), 143);
			put(new CurrencyPair("RT2", "BTC"), 235);
			put(new CurrencyPair("RYC", "BTC"), 9);
			put(new CurrencyPair("RZR", "BTC"), 237);
			put(new CurrencyPair("SAT2", "BTC"), 232);
			put(new CurrencyPair("SBC", "BTC"), 51);
			put(new CurrencyPair("SC", "BTC"), 225);
			put(new CurrencyPair("SFR", "BTC"), 270);
			put(new CurrencyPair("SHLD", "BTC"), 248);
			put(new CurrencyPair("SMC", "BTC"), 158);
			put(new CurrencyPair("SPA", "BTC"), 180);
			put(new CurrencyPair("SPT", "BTC"), 81);
			put(new CurrencyPair("SRC", "BTC"), 88);
			put(new CurrencyPair("STR", "BTC"), 83);
			put(new CurrencyPair("SUPER", "BTC"), 239);
			put(new CurrencyPair("SXC", "BTC"), 153);
			put(new CurrencyPair("SYNC", "BTC"), 271);
			put(new CurrencyPair("TAG", "BTC"), 117);
			put(new CurrencyPair("TAK", "BTC"), 166);
			put(new CurrencyPair("TEK", "BTC"), 114);
			put(new CurrencyPair("TES", "BTC"), 223);
			put(new CurrencyPair("TGC", "BTC"), 130);
			put(new CurrencyPair("TOR", "BTC"), 250);
			put(new CurrencyPair("TRC", "BTC"), 27);
			put(new CurrencyPair("UNB", "BTC"), 203);
			put(new CurrencyPair("UNO", "BTC"), 133);
			put(new CurrencyPair("URO", "BTC"), 247);
			put(new CurrencyPair("USDe", "BTC"), 201);
			put(new CurrencyPair("UTC", "BTC"), 163);
			put(new CurrencyPair("VIA", "BTC"), 261);
			put(new CurrencyPair("VOOT", "BTC"), 254);
			put(new CurrencyPair("VRC", "BTC"), 209);
			put(new CurrencyPair("VTC", "BTC"), 151);
			put(new CurrencyPair("WC", "BTC"), 195);
			put(new CurrencyPair("WDC", "BTC"), 14);
			put(new CurrencyPair("XC", "BTC"), 210);
			put(new CurrencyPair("XJO", "BTC"), 115);
			put(new CurrencyPair("XLB", "BTC"), 208);
			put(new CurrencyPair("XPM", "BTC"), 63);
			put(new CurrencyPair("XXX", "BTC"), 265);
			put(new CurrencyPair("YAC", "BTC"), 11);
			put(new CurrencyPair("YBC", "BTC"), 73);
			put(new CurrencyPair("ZCC", "BTC"), 140);
			put(new CurrencyPair("ZED", "BTC"), 170);
			put(new CurrencyPair("ZET", "BTC"), 85);
			put(new CurrencyPair("ADT", "LTC"), 94);
			put(new CurrencyPair("ANC", "LTC"), 121);
			put(new CurrencyPair("ASC", "LTC"), 111);
			put(new CurrencyPair("AUR", "LTC"), 161);
			put(new CurrencyPair("BAT", "LTC"), 186);
			put(new CurrencyPair("BC", "LTC"), 191);
			put(new CurrencyPair("CGB", "LTC"), 123);
			put(new CurrencyPair("CLOAK", "LTC"), 228);
			put(new CurrencyPair("CNC", "LTC"), 17);
			put(new CurrencyPair("COL", "LTC"), 109);
			put(new CurrencyPair("CPR", "LTC"), 91);
			put(new CurrencyPair("CRYPT", "LTC"), 220);
			put(new CurrencyPair("CTM", "LTC"), 175);
			put(new CurrencyPair("DBL", "LTC"), 46);
			put(new CurrencyPair("DGC", "LTC"), 96);
			put(new CurrencyPair("DIME", "LTC"), 206);
			put(new CurrencyPair("DMC", "LTC"), 194);
			put(new CurrencyPair("DOGE", "LTC"), 135);
			put(new CurrencyPair("DRK", "LTC"), 214);
			put(new CurrencyPair("DVC", "LTC"), 52);
			put(new CurrencyPair("EAC", "LTC"), 244);
			put(new CurrencyPair("ELP", "LTC"), 93);
			put(new CurrencyPair("EZC", "LTC"), 55);
			put(new CurrencyPair("FLAP", "LTC"), 246);
			put(new CurrencyPair("FLO", "LTC"), 61);
			put(new CurrencyPair("FRK", "LTC"), 171);
			put(new CurrencyPair("FST", "LTC"), 124);
			put(new CurrencyPair("FTC", "LTC"), 4);
			put(new CurrencyPair("GLD", "LTC"), 36);
			put(new CurrencyPair("GLYPH", "LTC"), 230);
			put(new CurrencyPair("GME", "LTC"), 84);
			put(new CurrencyPair("GUE", "LTC"), 242);
			put(new CurrencyPair("IFC", "LTC"), 60);
			put(new CurrencyPair("KARM", "LTC"), 193);
			put(new CurrencyPair("LEAF", "LTC"), 245);
			put(new CurrencyPair("LOT", "LTC"), 243);
			put(new CurrencyPair("LTCX", "LTC"), 234);
			put(new CurrencyPair("MAX", "LTC"), 218);
			put(new CurrencyPair("MEC", "LTC"), 100);
			put(new CurrencyPair("MEM", "LTC"), 56);
			put(new CurrencyPair("MEOW", "LTC"), 231);
			put(new CurrencyPair("MOON", "LTC"), 145);
			put(new CurrencyPair("MST", "LTC"), 62);
			put(new CurrencyPair("NET", "LTC"), 108);
			put(new CurrencyPair("NXT", "LTC"), 162);
			put(new CurrencyPair("NYAN", "LTC"), 263);
			put(new CurrencyPair("PPC", "LTC"), 125);
			put(new CurrencyPair("PXC", "LTC"), 101);
			put(new CurrencyPair("QRK", "LTC"), 126);
			put(new CurrencyPair("RBBT", "LTC"), 190);
			put(new CurrencyPair("RDD", "LTC"), 212);
			put(new CurrencyPair("RED", "LTC"), 87);
			put(new CurrencyPair("RZR", "LTC"), 238);
			put(new CurrencyPair("SBC", "LTC"), 128);
			put(new CurrencyPair("SUPER", "LTC"), 240);
			put(new CurrencyPair("SXC", "LTC"), 98);
			put(new CurrencyPair("TES", "LTC"), 224);
			put(new CurrencyPair("TIPS", "LTC"), 147);
			put(new CurrencyPair("TIX", "LTC"), 107);
			put(new CurrencyPair("VRC", "LTC"), 215);
			put(new CurrencyPair("VTC", "LTC"), 217);
			put(new CurrencyPair("WDC", "LTC"), 21);
			put(new CurrencyPair("XC", "LTC"), 216);
			put(new CurrencyPair("XNC", "LTC"), 67);
			put(new CurrencyPair("XPM", "LTC"), 106);
			put(new CurrencyPair("YAC", "LTC"), 22);
			put(new CurrencyPair("ZEIT", "LTC"), 176);
			put(new CurrencyPair("ZET", "LTC"), 127);
			put(new CurrencyPair("BTC", "USD"), 2);
			put(new CurrencyPair("DOGE", "USD"), 182);
			put(new CurrencyPair("DRK", "USD"), 213);
			put(new CurrencyPair("FTC", "USD"), 6);
			put(new CurrencyPair("LTC", "USD"), 1);
			put(new CurrencyPair("RDD", "USD"), 262);
			put(new CurrencyPair("42","XRP"), 345);
			put(new CurrencyPair("AC","XRP"), 342);
			put(new CurrencyPair("AERO","XRP"), 371);
			put(new CurrencyPair("ALN","XRP"), 382);
			put(new CurrencyPair("ANC","XRP"), 317);
			put(new CurrencyPair("APEX","XRP"), 433);
			put(new CurrencyPair("ARG","XRP"), 339);
			put(new CurrencyPair("AUR","XRP"), 338);
			put(new CurrencyPair("BLK","XRP"), 323);
			put(new CurrencyPair("BLU","XRP"), 395);
			put(new CurrencyPair("BTB","XRP"), 398);
			put(new CurrencyPair("BTCD","XRP"), 316);
			put(new CurrencyPair("BTG","XRP"), 421);
			put(new CurrencyPair("BTM","XRP"), 360);
			put(new CurrencyPair("CANN","XRP"), 358);
			put(new CurrencyPair("CAP","XRP"), 410);
			put(new CurrencyPair("CBX","XRP"), 414);
			put(new CurrencyPair("CENT","XRP"), 452);
			put(new CurrencyPair("CKC","XRP"), 346);
			put(new CurrencyPair("CLOAK","XRP"), 318);
			put(new CurrencyPair("CLR","XRP"), 435);
			put(new CurrencyPair("CNC","XRP"), 402);
			put(new CurrencyPair("COL","XRP"), 376);
			put(new CurrencyPair("CRACK","XRP"), 427);
			put(new CurrencyPair("CRAIG","XRP"), 411);
			put(new CurrencyPair("CRYPT","XRP"), 378);
			put(new CurrencyPair("DASH","XRP"), 313);
			put(new CurrencyPair("DEM","XRP"), 364);
			put(new CurrencyPair("DGB","XRP"), 330);
			put(new CurrencyPair("DGC","XRP"), 356);
			put(new CurrencyPair("DMD","XRP"), 352);
			put(new CurrencyPair("DOGE","XRP"), 311);
			put(new CurrencyPair("DRKC","XRP"), 341);
			put(new CurrencyPair("DT","XRP"), 425);
			put(new CurrencyPair("DVC","XRP"), 396);
			put(new CurrencyPair("EAC","XRP"), 417);
			put(new CurrencyPair("EMC2","XRP"), 405);
			put(new CurrencyPair("EXE","XRP"), 430);
			put(new CurrencyPair("FFC","XRP"), 393);
			put(new CurrencyPair("FIBRE","XRP"), 321);
			put(new CurrencyPair("FLAP","XRP"), 391);
			put(new CurrencyPair("FLO","XRP"), 383);
			put(new CurrencyPair("FLT","XRP"), 369);
			put(new CurrencyPair("FRC","XRP"), 424);
			put(new CurrencyPair("FRK","XRP"), 372);
			put(new CurrencyPair("GB","XRP"), 400);
			put(new CurrencyPair("GLD","XRP"), 413);
			put(new CurrencyPair("GLYPH","XRP"), 366);
			put(new CurrencyPair("HAL","XRP"), 359);
			put(new CurrencyPair("HBN","XRP"), 367);
			put(new CurrencyPair("HTML5","XRP"), 450);
			put(new CurrencyPair("HUC","XRP"), 418);
			put(new CurrencyPair("HVC","XRP"), 412);
			put(new CurrencyPair("ICB","XRP"), 397);
			put(new CurrencyPair("IFC","XRP"), 340);
			put(new CurrencyPair("IOC","XRP"), 385);
			put(new CurrencyPair("IXC","XRP"), 351);
			put(new CurrencyPair("JUDGE","XRP"), 429);
			put(new CurrencyPair("KARM","XRP"), 380);
			put(new CurrencyPair("KEY","XRP"), 401);
			put(new CurrencyPair("LEAF","XRP"), 436);
			put(new CurrencyPair("LKY","XRP"), 438);
			put(new CurrencyPair("LOT","XRP"), 392);
			put(new CurrencyPair("LSD","XRP"), 407);
			put(new CurrencyPair("LTB","XRP"), 390);
			put(new CurrencyPair("LTCD","XRP"), 320);
			put(new CurrencyPair("LXC","XRP"), 328);
			put(new CurrencyPair("MAX","XRP"), 370);
			put(new CurrencyPair("MEC","XRP"), 337);
			put(new CurrencyPair("MEOW","XRP"), 434);
			put(new CurrencyPair("MINT","XRP"), 432);
			put(new CurrencyPair("MNC","XRP"), 437);
			put(new CurrencyPair("MOON","XRP"), 347);
			put(new CurrencyPair("MRY","XRP"), 403);
			put(new CurrencyPair("MYR","XRP"), 333);
			put(new CurrencyPair("MZC","XRP"), 348);
			put(new CurrencyPair("NAUT","XRP"), 384);
			put(new CurrencyPair("NAV","XRP"), 431);
			put(new CurrencyPair("NEC","XRP"), 439);
			put(new CurrencyPair("NET","XRP"), 420);
			put(new CurrencyPair("NMB","XRP"), 426);
			put(new CurrencyPair("NMC","XRP"), 334);
			put(new CurrencyPair("NVC","XRP"), 349);
			put(new CurrencyPair("OPAL","XRP"), 362);
			put(new CurrencyPair("ORB","XRP"), 419);
			put(new CurrencyPair("OSC","XRP"), 406);
			put(new CurrencyPair("PHS","XRP"), 423);
			put(new CurrencyPair("POT","XRP"), 327);
			put(new CurrencyPair("PTS","XRP"), 325);
			put(new CurrencyPair("PXC","XRP"), 379);
			put(new CurrencyPair("QRK","XRP"), 344);
			put(new CurrencyPair("RZR","XRP"), 353);
			put(new CurrencyPair("SDC","XRP"), 428);
			put(new CurrencyPair("SFR","XRP"), 409);
			put(new CurrencyPair("SHADE","XRP"), 408);
			put(new CurrencyPair("SILK","XRP"), 415);
			put(new CurrencyPair("SLG","XRP"), 361);
			put(new CurrencyPair("SPA","XRP"), 386);
			put(new CurrencyPair("SRC","XRP"), 389);
			put(new CurrencyPair("SSV","XRP"), 375);
			put(new CurrencyPair("SUPER","XRP"), 373);
			put(new CurrencyPair("SXC","XRP"), 422);
			put(new CurrencyPair("SYS","XRP"), 365);
			put(new CurrencyPair("TAG","XRP"), 374);
			put(new CurrencyPair("TEK","XRP"), 363);
			put(new CurrencyPair("TES","XRP"), 388);
			put(new CurrencyPair("TIPS","XRP"), 368);
			put(new CurrencyPair("TRC","XRP"), 350);
			put(new CurrencyPair("UNB","XRP"), 404);
			put(new CurrencyPair("UNO","XRP"), 314);
			put(new CurrencyPair("URO","XRP"), 381);
			put(new CurrencyPair("USDe","XRP"), 394);
			put(new CurrencyPair("UTC","XRP"), 354);
			put(new CurrencyPair("VIA","XRP"), 343);
			put(new CurrencyPair("VRC","XRP"), 331);
			put(new CurrencyPair("VTC","XRP"), 335);
			put(new CurrencyPair("WC","XRP"), 336);
			put(new CurrencyPair("WDC","XRP"), 332);
			put(new CurrencyPair("XBOT","XRP"), 416);
			put(new CurrencyPair("XC","XRP"), 329);
			put(new CurrencyPair("XCR","XRP"), 387);
			put(new CurrencyPair("XPM","XRP"), 357);
			put(new CurrencyPair("XST","XRP"), 319);
			put(new CurrencyPair("XXX","XRP"), 377);
			put(new CurrencyPair("YAC","XRP"), 440);
			put(new CurrencyPair("ZEIT","XRP"), 399);
			put(new CurrencyPair("ZET","XRP"), 326);
		}
	};

	/**
	 * Converts a CurrencyPair (in form Base_Counter) to the appropriate
	 * marketId
	 *
	 * @param currencyPair
	 *            String CurrencyPair in form (Base_Counter)
	 * @return int representation of marketId
	 */
	public static int convertToMarketId(CurrencyPair currencyPair) {
		if (currencyPair.baseSymbol.equals("DRK") && currencyPair.counterSymbol.equals("BTC")) {
			return 155;
		}
		if (currencyPair.baseSymbol.equals("DRK") && currencyPair.counterSymbol.equals("USD")) {
			return 213;
		}
		if ((currencyPair.baseSymbol.equals("USD") && currencyPair.counterSymbol.equals("XRP"))
				|| (currencyPair.baseSymbol.equals("XRP") && currencyPair.counterSymbol.equals("USD")))

		{
			return 442;
		}
		if (currencyPair.counterSymbol.equals("DRK")) {
			currencyPair = new CurrencyPair(currencyPair.baseSymbol, "DASH");
		}
		if (currencyPair.baseSymbol.equals("DRK")) {
			currencyPair = new CurrencyPair("DASH", currencyPair.counterSymbol);
		}
		Integer out = currencyPairs_MarketIds.get(currencyPair);
		if (out == null) {
			out = currencyPairs_MarketIds.get(new CurrencyPair(currencyPair.counterSymbol, currencyPair.baseSymbol));
			if (out == null) {
				System.out.println("Cryptsy doesn't have a market for " + currencyPair + ".");
				throw new RuntimeException("Cryptsy doesn't have a market for " + currencyPair + ".");
			}
		}
		return out;
	}

	/**
	 * Converts a int marketId to the appropriate CurrencyPair
	 * 
	 * @param marketId
	 *            int representation of marketId
	 * @return CurrencyPair used by that of that market
	 */
	public static CurrencyPair convertToCurrencyPair(int marketId) {

		CurrencyPair currencyPairs = marketIds_CurrencyPairs.get(marketId);

		return (currencyPairs == null ? new CurrencyPair("null", "null") : currencyPairs);
	}
}
