package Fermin;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Everest extends Applet {

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {

		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		Color moradito = new Color(135, 129, 190);
		Color blanquito = new Color(236, 236, 236);
		Color rosita = new Color(213, 141, 145);
		Color verde = new Color(29, 189, 168);
		Color naranja = new Color(249, 174, 73);
		Color azul = new Color(231, 246, 247);
		Color placa = new Color(3, 191, 243);
		Color grisP = new Color(205, 205, 205);
		Color AzulO = new Color(99, 142, 179);

		// rellenos
		g2.setColor(Color.black);
		int PCNX[] = { 175, 173, 96, 98 };
		int PCNY[] = { 217, 261, 261, 217 };
		g2.fillPolygon(PCNX, PCNY, PCNX.length);

		g2.setColor(Color.black);
		int PNBX[] = { 291, 291, 312, 311 };
		int PNBY[] = { 416, 435, 433, 413 };
		g2.fillPolygon(PNBX, PNBY, PNBX.length);

		g2.setColor(verde);
		int CVX[] = { 361, 393, 391, 360 };
		int CVY[] = { 353, 354, 380, 377 };
		g2.fillPolygon(CVX, CVY, CVX.length);

		g2.setColor(verde);
		int CV2X[] = { 320, 337, 352, 324 };
		int CV2Y[] = { 314, 315, 340, 340 };
		g2.fillPolygon(CV2X, CV2Y, CV2X.length);

		g2.setColor(naranja);
		int CNX[] = { 291, 316, 324, 298 };
		int CNY[] = { 290, 290, 308, 305 };
		g2.fillPolygon(CNX, CNY, CNX.length);

		// morado cara
		g2.setColor(moradito);
		int x[] = { 318, 325, 329, 339, 348, 361, 370, 376, 395, 402, 387, 352, 372, 384, 392, 385, 364, 336, 362, 337,
				320, 255, 255 };
		int y[] = { 137, 140, 149, 153, 166, 169, 172, 186, 194, 196, 203, 206, 210, 211, 213, 216, 226, 230, 232, 237,
				240, 239, 137 };
		g2.fillPolygon(x, y, x.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(x, y, x.length);

		// cola blanca
		g2.setColor(blanquito);
		int ColaX[] = { 396, 424, 431, 438, 446, 456, 435, 448, 458, 467, 476, 485, 490, 478, 485, 487, 487, 484, 449,
				422 };
		int ColaY[] = { 402, 401, 399, 397, 395, 390, 389, 386, 383, 379, 374, 366, 356, 361, 348, 337, 321, 315, 317,
				357 };
		g2.fillPolygon(ColaX, ColaY, ColaX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(ColaX, ColaY, ColaX.length);

		// cola moradito
		g2.setColor(moradito);
		int ColaMX[] = { 395, 410, 418, 408, 423, 435, 444, 454, 464, 456, 448, 467, 455, 466, 473, 478, 481, 484, 479,
				472, 466, 460, 452, 445, 437, 428, 418, 373 };
		int ColaMY[] = { 398, 396, 392, 388, 387, 385, 381, 378, 371, 372, 374, 363, 366, 358, 349, 338, 324, 315, 306,
				297, 289, 284, 295, 305, 315, 322, 329, 343 };
		g2.fillPolygon(ColaMX, ColaMY, ColaMX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(ColaMX, ColaMY, ColaMX.length);

		// pata izquierda blanca
		g2.setColor(blanquito);
		int PIBX[] = { 143, 143, 79, 76, 69, 64, 56, 50, 43, 35, 31, 28, 28, 32, 41, 53, 60, 67, 75, 82, 88, 88, 88,
				143 };
		int PIBY[] = { 388, 472, 471, 470, 469, 466, 466, 462, 462, 457, 452, 444, 428, 419, 408, 404, 404, 401, 401,
				403, 404, 391, 348, 348 };
		g2.fillPolygon(PIBX, PIBY, PIBX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PIBX, PIBY, PIBX.length);

		// traje verde fondo
		g2.setColor(verde);
		int TrajeX[] = { 114, 114, 145, 219, 292, 330, 339, 305, 295, 289, 281 };
		int TrajeY[] = { 266, 352, 390, 416, 416, 389, 361, 299, 285, 277, 259 };
		g2.fillPolygon(TrajeX, TrajeY, TrajeX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(TrajeX, TrajeY, TrajeX.length);

		// patita derecha parte moradita
		g2.setColor(moradito);
		int patitaDMX[] = { 395, 395, 392, 390, 382, 370, 341, 331, 322, 314, 310, 306, 304, 304 };
		int patitaDMY[] = { 426, 398, 390, 382, 371, 362, 362, 364, 373, 386, 398, 408, 419, 426 };
		g2.fillPolygon(patitaDMX, patitaDMY, patitaDMX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(patitaDMX, patitaDMY, patitaDMX.length);

		// parte blanca de patita derecha
		g2.setColor(blanquito);
		int pataBx[] = { 300, 304, 317, 320, 322, 332, 345, 360, 369, 378, 387, 389, 395, 395, 301 };
		int pataBy[] = { 440, 426, 405, 413, 423, 411, 423, 404, 404, 421, 411, 421, 426, 464, 464 };
		g2.fillPolygon(pataBx, pataBy, pataBx.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(pataBx, pataBy, pataBx.length);

		// parte blanca de patita derecha
		g2.setColor(blanquito);
		int patitaDX[] = { 295, 295, 298, 305, 312, 319, 330, 333, 341, 367, 375, 391, 401, 402, 399, 390, 379, 366,
				354, 337, 325, 314, 308 };
		int patitaDY[] = { 449, 467, 472, 473, 475, 476, 475, 475, 478, 478, 474, 475, 471, 457, 447, 439, 432, 428,
				427, 427, 430, 431, 436 };
		g2.fillPolygon(patitaDX, patitaDY, patitaDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(patitaDX, patitaDY, patitaDX.length);

		// traje naranja derecho
		g2.setColor(naranja);
		int TNDX[] = { 234, 251, 262, 278, 285, 285, 269, 262, 253, 233, 203, 178, 161, 153, 147, 147, 157, 166, 176,
				189, 204, 215, 224 };
		int TNDY[] = { 300, 300, 301, 311, 320, 333, 350, 355, 359, 362, 366, 368, 366, 363, 357, 344, 334, 327, 321,
				314, 308, 303, 302 };
		g2.fillPolygon(TNDX, TNDY, TNDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(TNDX, TNDY, TNDX.length);
		g2.drawLine(264, 332, 267, 336);

		// pata ziquierda morado
		g2.setColor(moradito);
		int PIMX[] = { 84, 71, 74, 78, 81, 83, 87, 92, 94, 108, 109, 113, 130, 136, 114 };
		int PIMY[] = { 335, 331, 339, 351, 361, 379, 387, 386, 377, 388, 375, 374, 389, 384, 351 };
		g2.fillPolygon(PIMX, PIMY, PIMX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PIMX, PIMY, PIMX.length);

		// pata derecha morado
		g2.setColor(moradito);
		int PataDMX[] = { 154, 155, 163, 171, 173, 183, 191, 199, 203, 204, 206, 214, 221, 228, 238, 240, 246, 252, 259,
				263, 255, 248, 227, 213, 203, 191, 180, 169, 164, 168, 162, 155 };
		int PataDMY[] = { 380, 400, 395, 391, 404, 397, 390, 387, 391, 399, 409, 404, 400, 410, 385, 376, 364, 351, 340,
				332, 325, 323, 323, 324, 327, 331, 336, 343, 350, 355, 366, 376 };
		g2.fillPolygon(PataDMX, PataDMY, PataDMX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PataDMX, PataDMY, PataDMX.length);

		// pata derecha blanco
		g2.setColor(blanquito);
		int PataDBX[] = { 154, 146, 139, 131, 123, 108, 97, 86, 80, 78, 77, 79, 84, 94, 105, 115, 127, 136, 143, 150,
				167, 180, 191, 204, 213, 216, 220, 225, 229, 222, 207, 205, 204, 197, 174, 174, 168, 156, 156 };
		int PataDBY[] = { 380, 391, 399, 407, 416, 416, 419, 426, 437, 456, 461, 471, 480, 485, 485, 489, 492, 492, 488,
				492, 492, 488, 481, 472, 461, 448, 436, 423, 410, 400, 409, 398, 391, 386, 404, 393, 391, 401, 384 };
		g2.fillPolygon(PataDBX, PataDBY, PataDBX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PataDBX, PataDBY, PataDBX.length);
		g2.drawLine(167, 356, 175, 347);

		// carita
		g2.setColor(blanquito);
		int CaraX[] = { 57, 59, 63, 69, 76, 85, 93, 102, 108, 112, 121, 136, 154, 172, 210, 253, 265, 275, 291, 303,
				315, 327, 338, 348, 337, 328, 322, 334, 314, 345, 336, 327, 317, 330, 343, 335, 327, 320, 317, 330, 323,
				318, 318, 295, 224, 135, 114, 105, 100, 94, 88, 69, 63, 63 };
		int CaraY[] = { 136, 148, 160, 171, 181, 191, 200, 208, 215, 222, 228, 231, 235, 237, 239, 238, 236, 234, 233,
				230, 227, 222, 218, 211, 209, 206, 202, 202, 194, 198, 192, 186, 175, 180, 184, 178, 172, 165, 160, 165,
				155, 146, 137, 99, 68, 59, 75, 86, 98, 109, 118, 121, 121, 138 };
		g2.fillPolygon(CaraX, CaraY, CaraX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(CaraX, CaraY, CaraX.length);
		g2.drawLine(61, 120, 70, 124);
		g2.drawLine(70, 124, 80, 126);
		g2.drawLine(62, 137, 69, 146);

		// nariz
		g2.setColor(Color.black);
		int NX[] = { 101, 130, 141, 148, 152, 146, 135, 127, 113, 106, 100, 96, 92, 90, 94 };
		int NY[] = { 137, 137, 141, 147, 156, 161, 166, 169, 169, 168, 165, 160, 152, 146, 140 };
		g2.fillPolygon(NX, NY, NX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(NX, NY, NX.length);

		// abajo de la raniz
		g2.setColor(blanquito);
		int NAX[] = { 110, 106, 100, 96, 92, 90, 88, 85, 85, 90, 98, 106, 117, 108, 109 };
		int NAY[] = { 168, 168, 165, 160, 152, 146, 151, 159, 175, 187, 195, 199, 199, 186, 168 };
		g2.fillPolygon(NAX, NAY, NAX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(NAX, NAY, NAX.length);

		// oreja Izq blanco
		g2.setColor(blanquito);
		int OIX[] = { 155, 159, 165, 173, 179, 186, 195, 202, 209, 216, 221, 164 };
		int OIY[] = { 39, 27, 18, 9, 6, 8, 14, 18, 24, 29, 56, 53 };
		g2.fillPolygon(OIX, OIY, OIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(OIX, OIY, OIX.length);

		// oreja Izq rosa
		g2.setColor(rosita);
		int ORIX[] = { 166, 168, 172, 178, 185, 187, 186, 181, 172 };
		int ORIY[] = { 39, 31, 24, 17, 24, 33, 37, 52, 51 };
		g2.fillPolygon(ORIX, ORIY, ORIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(ORIX, ORIY, ORIX.length);

		// oreja dere blanco
		g2.setColor(blanquito);
		int ODX[] = { 304, 305, 316, 329, 338, 346, 388, 400, 412, 425, 425, 423, 418, 412, 406, 396, 382, 357, 295 };
		int ODY[] = { 74, 61, 55, 51, 49, 48, 48, 49, 50, 53, 62, 73, 84, 94, 103, 116, 127, 133, 86 };
		g2.fillPolygon(ODX, ODY, ODX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(ODX, ODY, ODX.length);

		// oreja dere rosa
		g2.setColor(rosita);
		int ORDX[] = { 348, 357, 363, 366, 341, 358, 342, 355, 368, 383, 394, 409, 405, 400, 392, 386, 381, 372, 367,
				355, 342 };
		int ORDY[] = { 100, 97, 92, 86, 86, 79, 78, 73, 70, 67, 65, 65, 74, 82, 92, 100, 107, 116, 119, 122, 115 };
		g2.fillPolygon(ORDX, ORDY, ORDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(ORDX, ORDY, ORDX.length);

		// sombrero verde
		g2.setColor(verde);
		int SVX[] = { 216, 231, 261, 274, 286, 298, 308, 316, 326, 329, 316, 310, 306, 298, 289, 277, 265, 255, 245,
				234, 225 };
		int SVY[] = { 31, 30, 30, 31, 34, 37, 40, 43, 47, 51, 55, 58, 56, 52, 48, 44, 42, 39, 37, 35, 33 };
		g2.fillPolygon(SVX, SVY, SVX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(SVX, SVY, SVX.length);

		// sombrero naranja
		g2.setColor(naranja);
		int SNX[] = { 181, 186, 192, 200, 208, 211, 218, 225, 234, 245, 255, 265, 277, 289, 298, 306, 304, 303, 295,
				290, 284, 265, 259, 256, 248, 240, 227, 220, 214, 197, 191, 185 };
		int SNY[] = { 40, 38, 36, 35, 34, 33, 33, 33, 35, 37, 39, 42, 44, 48, 52, 56, 61, 74, 74, 68, 64, 64, 59, 54,
				51, 50, 50, 46, 42, 42, 44, 42 };
		g2.fillPolygon(SNX, SNY, SNX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(SNX, SNY, SNX.length);

		// peluche sombrero
		g2.setColor(azul);
		int SX[] = { 98, 106, 114, 124, 130, 137, 144, 149, 158, 165, 173, 181, 194, 200, 202, 207, 214, 223, 230, 248,
				254, 262, 273, 288, 295, 305, 310, 318, 325, 329, 338, 348, 361, 368, 376, 384, 389, 397, 398, 402, 401,
				395, 394, 388, 382, 376, 367, 362, 355, 348, 337, 332, 330, 325, 315, 304, 295, 289, 284, 266, 261, 256,
				249, 240, 227, 221, 214, 197, 191, 185, 181, 174, 166, 155, 146, 137, 128, 109, 104, 99, 89, 90, 98 };
		int SY[] = { 100, 86, 75, 71, 70, 73, 73, 71, 71, 73, 77, 82, 81, 82, 84, 83, 83, 90, 93, 93, 95, 105, 105, 120,
				122, 124, 134, 134, 140, 148, 153, 166, 169, 173, 185, 184, 181, 174, 164, 161, 156, 149, 140, 135, 127,
				122, 119, 111, 105, 101, 101, 96, 88, 84, 82, 74, 74, 68, 64, 64, 58, 54, 51, 50, 50, 46, 42, 42, 44,
				42, 40, 39, 39, 43, 42, 40, 39, 51, 59, 70, 77, 93, 99 };
		g2.fillPolygon(SX, SY, SX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(SX, SY, SX.length);

		// linea collar
		g2.setColor(Color.gray);
		int CX[] = { 136, 148, 142, 130 };
		int CY[] = { 231, 234, 246, 243 };
		g2.fillPolygon(CX, CY, CX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(CX, CY, CX.length);

		// linea collar abajo
		g2.setColor(Color.gray);
		int CAX[] = { 107, 113, 117, 120, 118, 117, 117, 118, 121, 124, 128, 132, 137, 143, 149, 145, 136, 126, 121,
				115, 112, 107, 105, 103, 103, 105 };
		int CAY[] = { 286, 290, 293, 295, 300, 305, 332, 339, 346, 353, 361, 368, 375, 380, 385, 390, 384, 375, 369,
				363, 356, 349, 340, 333, 296, 290 };
		g2.fillPolygon(CAX, CAY, CAX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(CAX, CAY, CAX.length);

		// linea collar abajo patas
		g2.setColor(Color.gray);
		int CAPX[] = { 217, 235, 241, 224, 221 };
		int CAPY[] = { 442, 442, 437, 425, 432 };
		g2.fillPolygon(CAPX, CAPY, CAPX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(CAPX, CAPY, CAPX.length);

		g2.drawLine(221, 432, 232, 441);

		// placa exterior
		g2.setColor(grisP);
		int PEX[] = { 117, 133, 144, 156, 152, 146, 142, 137, 131, 124, 119, 113, 108, 103, 100, 97, 97, 98, 103, 109 };
		int PEY[] = { 244, 244, 246, 258, 264, 270, 275, 279, 283, 286, 288, 290, 285, 281, 277, 272, 262, 256, 250,
				249 };
		g2.fillPolygon(PEX, PEY, PEX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PEX, PEY, PEX.length);

		// placa exterior pequeña
		g2.setColor(grisP);
		int PEPX[] = { 113, 119, 124, 131, 137, 142, 146, 152, 156, 159, 160, 157, 152, 148, 144, 139, 133, 131, 126,
				122, 117 };
		int PEPY[] = { 290, 288, 286, 283, 279, 275, 270, 264, 258, 259, 264, 268, 272, 277, 281, 285, 288, 289, 290,
				292, 293 };
		g2.fillPolygon(PEPX, PEPY, PEPX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PEPX, PEPY, PEPX.length);

		// placa interior pequeña
		g2.setColor(grisP);
		int PIPX[] = { 104, 105, 109, 114, 118, 113, 139, 145, 145, 140, 133, 123, 115, 108, 103, 102 };
		int PIPY[] = { 271, 264, 257, 255, 251, 251, 252, 253, 250, 249, 248, 247, 250, 254, 259, 264 };
		g2.fillPolygon(PIPX, PIPY, PIPX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PIPX, PIPY, PIPX.length);

		// placa interior azul
		g2.setColor(placa);
		int PIAX[] = { 104, 105, 109, 114, 118, 113, 139, 145, 150, 145, 139, 134, 130, 125, 120, 115, 109, 105 };
		int PIAY[] = { 271, 264, 257, 255, 250, 251, 252, 253, 258, 264, 270, 275, 279, 282, 284, 284, 282, 276 };
		g2.fillPolygon(PIAX, PIAY, PIAX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PIAX, PIAY, PIAX.length);

		// arbol superior
		g2.setColor(grisP);
		int ASX[] = { 128, 132, 130, 128, 124, 122, 118, 118 };
		int ASY[] = { 253, 263, 263, 261, 263, 260, 263, 260 };
		g2.fillPolygon(ASX, ASY, ASX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(ASX, ASY, ASX.length);

		// arbol medio
		g2.setColor(grisP);
		int AMX[] = { 118, 122, 124, 128, 130, 133, 129, 127, 124, 121, 116, 113, 109 };
		int AMY[] = { 263, 260, 263, 261, 263, 270, 270, 269, 271, 268, 269, 268, 267 };
		g2.fillPolygon(AMX, AMY, AMX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(AMX, AMY, AMX.length);

		// arbol inferior
		g2.setColor(grisP);
		int AIX[] = { 113, 116, 121, 124, 127, 129, 131, 119, 116, 111 };
		int AIY[] = { 268, 269, 268, 271, 269, 270, 273, 280, 281, 273 };
		g2.fillPolygon(AIX, AIY, AIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(AIX, AIY, AIX.length);

		// detalle de arbol
		g2.drawLine(115, 273, 118, 277);
		g2.drawLine(118, 277, 122, 273);

		// peluche cuello derecho
		g2.setColor(azul);
		int PCDX[] = { 172, 210, 255, 289, 289, 293, 292, 283, 274, 263, 251, 250, 243, 241, 233, 223, 213, 198, 194,
				181, 175, 172, 170, 163, 160, 158, 151, 150, 152, 156, 159, 167 };
		int PCDY[] = { 238, 239, 239, 240, 247, 252, 258, 264, 265, 272, 272, 277, 278, 277, 277, 283, 288, 288, 290,
				290, 285, 276, 273, 268, 264, 260, 252, 246, 244, 244, 243, 243 };
		g2.fillPolygon(PCDX, PCDY, PCDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PCDX, PCDY, PCDX.length);

		// peluche cuello izquierdo
		g2.setColor(azul);
		int PCIX[] = { 103, 95, 90, 88, 75, 75, 78, 74, 75, 78, 86, 91, 97, 98, 103, 109, 117, 120, 113, 112, 106, 112,
				107 };
		int PCIY[] = { 212, 213, 218, 227, 238, 248, 254, 260, 268, 272, 272, 266, 265, 257, 250, 249, 244, 242, 235,
				231, 226, 222, 216 };
		g2.fillPolygon(PCIX, PCIY, PCIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PCIX, PCIY, PCIX.length);

		// traje izquierdo verde
		g2.setColor(verde);
		int TIX[] = { 126, 121, 115, 112, 107, 105, 103, 103, 105, 108, 104, 100, 97, 97, 91, 86, 78, 73, 70, 69, 69,
				71, 76, 78, 78, 81, 88, 94, 103, 111, 118 };
		int TIY[] = { 375, 369, 363, 356, 349, 340, 333, 296, 290, 286, 281, 277, 272, 266, 266, 272, 272, 281, 291,
				296, 302, 308, 314, 316, 321, 327, 339, 348, 359, 367, 372 };
		g2.fillPolygon(TIX, TIY, TIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(TIX, TIY, TIX.length);

		// detalle de traje verde
		g2.drawLine(77, 314, 77, 289);
		g2.drawLine(77, 289, 81, 282);

		// traje naranja izquierdo
		g2.setColor(naranja);
		int TNX[] = { 86, 77, 70, 65, 61, 58, 57, 62, 69, 73, 70, 69, 69, 71, 76, 78, 78, 81 };
		int TNY[] = { 337, 332, 331, 321, 313, 306, 295, 287, 281, 281, 291, 296, 302, 308, 314, 316, 321, 327 };
		g2.fillPolygon(TNX, TNY, TNX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(TNX, TNY, TNX.length);

		// traje verde abajo
		g2.setColor(verde);
		int VAX[] = { 239, 246, 285, 287, 290, 293, 295, 301, 302, 302, 303, 290, 280, 270, 261, 253, 247 };
		int VAY[] = { 436, 439, 439, 438, 437, 437, 437, 436, 427, 418, 420, 424, 427, 430, 432, 433, 435 };
		g2.fillPolygon(VAX, VAY, VAX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(VAX, VAY, VAX.length);

		// linea naranja baja
		g2.setColor(naranja);
		int LNBX[] = { 303, 290, 280, 270, 261, 253, 247, 241, 224, 228, 237, 248, 257, 267, 276, 286, 296, 305, 314,
				309, 306 };
		int LNBY[] = { 420, 424, 427, 430, 432, 433, 435, 437, 425, 415, 412, 411, 408, 405, 402, 397, 393, 389, 385,
				398, 408 };
		g2.fillPolygon(LNBX, LNBY, LNBX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(LNBX, LNBY, LNBX.length);

		g2.drawLine(227, 422, 248, 417);
		g2.drawLine(248, 417, 270, 411);
		g2.drawLine(270, 411, 290, 405);
		g2.drawLine(290, 405, 311, 396);

		// esquina traje verde derecha mochila
		g2.setColor(verde);
		int ESQVX[] = { 295, 303, 313, 324, 334, 342, 341, 315, 301, 295, 290, 284, 284, 292 };
		int ESQVY[] = { 252, 252, 254, 255, 257, 261, 266, 297, 291, 285, 277, 267, 263, 258 };
		g2.fillPolygon(ESQVX, ESQVY, ESQVX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(ESQVX, ESQVY, ESQVX.length);

		// mochila grande verde
		g2.setColor(verde);
		int MVX[] = { 341, 363, 340, 339, 342, 368, 344, 347, 327, 326, 318, 315 };
		int MVY[] = { 266, 273, 304, 311, 316, 351, 353, 336, 314, 308, 303, 297 };
		g2.fillPolygon(MVX, MVY, MVX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(MVX, MVY, MVX.length);

		// mochila grande verde interna
		g2.setColor(verde);
		int MVIX[] = { 363, 340, 339, 342, 368, 376, 385, 397, 410, 417, 412, 408, 401, 392, 377, 371 };
		int MVIY[] = { 273, 304, 311, 316, 351, 360, 366, 358, 340, 329, 320, 310, 300, 290, 277, 273 };
		g2.fillPolygon(MVIX, MVIY, MVIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(MVIX, MVIY, MVIX.length);

		// franja mochila1
		g2.setColor(naranja);
		int FMX[] = { 341, 363, 368, 410, 416, 419, 418, 416, 414, 376, 375, 374, 358, 341 };
		int FMY[] = { 266, 273, 287, 340, 342, 339, 332, 330, 335, 289, 272, 268, 262, 260 };
		g2.fillPolygon(FMX, FMY, FMX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(FMX, FMY, FMX.length);

		// franja pequeña izquierda mochila1
		g2.setColor(naranja);
		int FMPIX[] = { 378, 385, 370, 355, 341, 336, 349, 363 };
		int FMPIY[] = { 299, 307, 322, 332, 331, 323, 324, 317 };
		g2.fillPolygon(FMPIX, FMPIY, FMPIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(FMPIX, FMPIY, FMPIX.length);
		g2.drawLine(349, 324, 355, 332);

		// franja pequeña derecha mochila1
		g2.setColor(naranja);
		int FMPDX[] = { 400, 406, 390, 375, 352, 344, 368, 385 };
		int FMPDY[] = { 327, 334, 349, 362, 362, 353, 352, 343 };
		g2.fillPolygon(FMPDX, FMPDY, FMPDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(FMPDX, FMPDY, FMPDX.length);
		g2.drawLine(368, 351, 375, 359);

		// cuadro gris mochila izq
		g2.setColor(grisP);
		int PMIX[] = { 361, 373, 385, 374 };
		int PMIY[] = { 315, 325, 315, 303 };
		g2.fillPolygon(PMIX, PMIY, PMIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PMIX, PMIY, PMIX.length);
		g2.drawLine(368, 311, 374, 306);

		// cuadro gris mochila dere
		g2.setColor(grisP);
		int PMDX[] = { 381, 394, 405, 394 };
		int PMDY[] = { 339, 328, 340, 351 };
		g2.fillPolygon(PMDX, PMDY, PMDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(PMDX, PMDY, PMDX.length);
		g2.drawLine(387, 339, 393, 333);

		// hueco 1 izquierda
		g2.setColor(naranja);
		int H1X[] = { 374, 376, 381, 379 };
		int H1Y[] = { 311, 309, 314, 316 };
		g2.fillPolygon(H1X, H1Y, H1X.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(H1X, H1Y, PMDX.length);
		g2.drawLine(387, 339, 393, 333);

		// hueco 2 izquierda
		g2.setColor(naranja);
		int H2X[] = { 370, 373, 377, 375 };
		int H2Y[] = { 315, 314, 317, 319 };
		g2.fillPolygon(H2X, H2Y, H2X.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(H2X, H2Y, H2X.length);
		g2.drawLine(387, 339, 393, 333);

		// hueco 1 derecha
		g2.setColor(naranja);
		int H1IX[] = { 394, 399, 401, 396 };
		int H1IY[] = { 337, 341, 339, 334 };
		g2.fillPolygon(H1IX, H1IY, H1IX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(H1IX, H1IY, H1IX.length);
		g2.drawLine(387, 339, 393, 333);

		// hueco 2 derecha
		g2.setColor(naranja);
		int H2IX[] = { 392, 397, 394, 390 };
		int H2IY[] = { 339, 343, 345, 341 };
		g2.fillPolygon(H2IX, H2IY, H2IX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(H2IX, H2IY, H2IX.length);
		g2.drawLine(387, 339, 393, 333);

		// mochila pequeña verde externa
		g2.setColor(verde);
		int MVPX[] = { 309, 323, 322, 340, 335, 330, 322, 304, 291, 307 };
		int MVPY[] = { 305, 311, 322, 348, 354, 364, 373, 373, 343, 320 };
		g2.fillPolygon(MVPX, MVPY, MVPX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(MVPX, MVPY, MVPX.length);
		g2.drawLine(387, 339, 393, 333);

		// mochila pequeña verde interna
		g2.setColor(verde);
		int MVPIX[] = { 309, 323, 322, 308, 310, 315, 322, 304, 291, 307 };
		int MVPIY[] = { 305, 311, 322, 343, 357, 369, 373, 373, 343, 320 };
		g2.fillPolygon(MVPIX, MVPIY, MVPIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(MVPIX, MVPIY, MVPIX.length);
		g2.drawLine(387, 339, 393, 333);

		// Franja mochila pequeña
		g2.setColor(naranja);
		int FNPX[] = { 309, 307, 291, 304, 309, 305, 300, 288, 288, 286, 303, 304, 318, 326, 327, 327, 340, 343, 347,
				346, 353, 339, 335, 340, 328, 322, 323 };
		int FNPY[] = { 305, 320, 343, 373, 372, 377, 376, 360, 352, 342, 316, 300, 303, 308, 314, 320, 341, 334, 336,
				349, 362, 362, 354, 348, 330, 322, 311 };
		g2.fillPolygon(FNPX, FNPY, FNPX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(FNPX, FNPY, FNPX.length);
		g2.drawLine(339, 349, 346, 352);

		// franj mochila pequeña
		g2.setColor(naranja);
		int FMPX[] = { 328, 333, 314, 300, 297, 310 };
		int FMPY[] = { 330, 335, 365, 365, 358, 358 };
		g2.fillPolygon(FMPX, FMPY, FMPX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(FMPX, FMPY, FMPX.length);
		g2.drawLine(368, 351, 375, 359);

		// seguro negro mochila
		g2.setColor(Color.black);
		int SNMX[] = { 321, 326, 329, 323, 324, 329, 334, 330, 325, 319, 323, 322, 317, 311, 315 };
		int SNMY[] = { 331, 331, 334, 341, 339, 341, 345, 350, 359, 359, 352, 349, 352, 346, 338 };
		g2.fillPolygon(SNMX, SNMY, SNMX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(SNMX, SNMY, SNMX.length);

		// ojo blanco
		g2.setColor(Color.WHITE);
		int OBX[] = { 201, 190, 194, 204, 212, 223, 232, 240, 252, 263, 265, 266, 264, 258, 250 };
		int OBY[] = { 151, 141, 133, 121, 117, 115, 116, 117, 122, 127, 134, 146, 153, 160, 161 };
		g2.fillPolygon(OBX, OBY, OBX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(OBX, OBY, OBX.length);
		// ojo blanco 2do delineado
		g2.setColor(Color.WHITE);
		int OB1X[] = { 200, 189, 193, 203, 211, 222, 231, 239, 251, 262, 264, 265, 263, 257, 249 };
		int OB1Y[] = { 150, 140, 132, 120, 116, 114, 115, 116, 121, 128, 133, 145, 152, 159, 160 };
		g2.fillPolygon(OB1X, OB1Y, OB1X.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(OB1X, OB1Y, OB1X.length);

		// ceja derecha
		g2.setColor(Color.BLACK);
		int CDX[] = { 241, 254, 267, 271, 271, 266, 259, 246, 240 };
		int CDY[] = { 98, 99, 107, 115, 119, 111, 105, 101, 100 };
		g2.fillPolygon(CDX, CDY, CDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(CDX, CDY, CDX.length);

		// ceja izquierda
		g2.setColor(Color.BLACK);
		int CIX[] = { 121, 136, 145, 145, 136, 127, 121 };
		int CIY[] = { 76, 73, 75, 77, 76, 78, 80 };
		g2.fillPolygon(CIX, CIY, CIX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(CIX, CIY, CIX.length);

		// iris derecho
		g2.setColor(AzulO);
		int IDX[] = { 202, 208, 214, 223, 229, 237, 241, 247, 252, 252, 248, 243, 234, 220, 212, 206, 203, 202 };
		int IDY[] = { 151, 155, 158, 160, 161, 161, 159, 155, 150, 140, 135, 132, 129, 129, 132, 136, 142, 148 };
		g2.fillPolygon(IDX, IDY, IDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(IDX, IDY, IDX.length);

		// bolita negra derecho
		g2.setColor(Color.black);
		int BDX[] = { 222, 235, 237, 239, 243, 243, 237, 232, 228, 227, 224, 218, 214, 212, 212, 214 };
		int BDY[] = { 156, 156, 154, 154, 149, 142, 136, 134, 134, 138, 140, 140, 138, 141, 147, 151 };
		g2.fillPolygon(BDX, BDY, BDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(BDX, BDY, BDX.length);

		// bolita blanca derecho
		g2.setColor(Color.white);
		int BBDX[] = { 215, 218, 225, 227, 228, 224, 220, 215 };
		int BBDY[] = { 138, 140, 140, 138, 135, 132, 132, 133 };
		g2.fillPolygon(BBDX, BBDY, BBDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(BBDX, BBDY, BBDX.length);

		// delineado derecho
		g2.setColor(Color.BLACK);
		int DDX[] = { 204, 212, 223, 232, 240, 252, 263, 265, 266, 281, 285, 275, 270, 274, 283, 290, 272, 269, 275,
				282, 282, 271, 265, 257, 247, 237, 223, 213 };
		int DDY[] = { 121, 117, 115, 116, 117, 122, 129, 134, 146, 146, 144, 143, 140, 139, 138, 135, 135, 132, 131,
				126, 121, 127, 127, 120, 115, 113, 112, 115 };
		g2.fillPolygon(DDX, DDY, DDX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(DDX, DDY, DDX.length);

		// ojo izquierdo y pestañas
		g2.setColor(Color.black);
		int OIPX[] = { 114, 120, 137, 150, 151, 148, 141, 137, 126, 117, 112, 112, 108, 112, 110, 102, 102, 108, 107,
				100, 106, 101, 96, 103 };
		int OIPY[] = { 131, 133, 134, 120, 112, 109, 97, 95, 94, 95, 91, 85, 91, 98, 100, 95, 99, 103, 105, 104, 109,
				123, 128, 128 };
		g2.fillPolygon(OIPX, OIPY, OIPX.length);
		g2.drawLine(150, 122, 152, 98);
		g2.drawLine(152, 98, 148, 92);

		// bolita blanca ojo izquierdo
		g2.setColor(Color.white);
		int BBX[] = { 125, 132, 135, 135, 131, 126, 123 };
		int BBY[] = { 119, 119, 116, 112, 110, 111, 115 };
		g2.fillPolygon(BBX, BBY, BBX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(BBX, BBY, BBX.length);

		// iris ojo izquierdo
		g2.setColor(AzulO);
		int IX[] = { 114, 120, 127, 122, 122, 125, 126, 131, 135, 141, 146, 146, 142, 127, 113 };
		int IY[] = { 131, 133, 133, 127, 120, 115, 111, 110, 112, 113, 115, 108, 108, 108, 117 };
		g2.fillPolygon(IX, IY, IX.length);
		g2.setColor(Color.BLACK);
		g2.drawPolygon(IX, IY, IX.length);

		// blanco ojo izquierdo
		g2.setColor(Color.white);
		int BIX[] = { 114, 113, 127, 142, 146, 137, 125, 114, 107, 104, 104, 108 };
		int BIY[] = { 131, 117, 106, 107, 106, 97, 98, 103, 112, 118, 125, 128 };
		g2.fillPolygon(BIX, BIY, BIX.length);

		// pestañas pequeñas
		g2.setColor(Color.black);
		int P1X[] = { 250, 257, 259, 255 };
		int P1Y[] = { 161, 168, 167, 160 };
		g2.fillPolygon(P1X, P1Y, P1X.length);

		int P2X[] = { 258, 264, 266, 261 };
		int P2Y[] = { 160, 164, 162, 158 };
		g2.fillPolygon(P2X, P2Y, P2X.length);

		// detalles
		g2.drawLine(333, 475, 328, 468);
		g2.drawLine(328, 468, 328, 452);
		g2.drawLine(328, 452, 332, 442);
		g2.drawLine(332, 442, 335, 437);

		g2.drawLine(374, 474, 377, 469);
		g2.drawLine(377, 469, 376, 453);
		g2.drawLine(376, 453, 369, 438);

		// marca pata
		g2.setColor(Color.black);
		int LPX[] = { 123, 136, 144, 149, 157, 171, 180, 186, 193 };
		int LPY[] = { 415, 415, 416, 419, 420, 424, 427, 429, 429 };
		g2.fillPolygon(LPX, LPY, LPX.length);

		g2.setColor(Color.black);
		int LP1X[] = { 146, 135, 135 };
		int LP1Y[] = { 492, 474, 467 };
		g2.fillPolygon(LP1X, LP1Y, LP1X.length);
		g2.drawLine(135, 467, 135, 446);
		g2.drawLine(135, 446, 147, 430);

		g2.drawLine(105, 485, 100, 470);
		g2.drawLine(100, 470, 98, 463);
		g2.drawLine(98, 463, 98, 443);
		g2.drawLine(98, 443, 106, 431);
		g2.drawLine(106, 431, 117, 424);

		g2.drawLine(64, 464, 59, 457);
		g2.drawLine(59, 457, 59, 436);
		g2.drawLine(59, 436, 63, 421);
		g2.drawLine(63, 421, 74, 411);
		g2.drawLine(74, 411, 86, 411);

		g2.drawLine(56, 404, 41, 419);
		g2.drawLine(41, 419, 40, 444);
		g2.drawLine(40, 444, 48, 462);

		g2.drawLine(195, 246, 206, 249);
		g2.drawLine(206, 249, 206, 255);

		g2.drawLine(204, 266, 204, 271);
		g2.drawLine(204, 271, 199, 275);

		g2.drawLine(117, 199, 135, 207);
		g2.drawLine(135, 207, 165, 207);
		g2.drawLine(165, 207, 186, 202);
		g2.drawLine(186, 202, 204, 197);
		g2.drawLine(204, 197, 221, 187);
		g2.drawLine(215, 182, 231, 192);

		g2.drawLine(251, 244, 251, 251);
		g2.drawLine(251, 251, 243, 257);
		g2.drawLine(243, 257, 237, 257);

		g2.drawLine(88, 404, 97, 401);

		g2.drawLine(94, 228, 94, 235);
		g2.drawLine(94, 235, 87, 240);
		g2.drawLine(87, 240, 88, 245);

		g2.drawLine(87, 252, 84, 255);
		g2.drawLine(84, 255, 84, 258);
		g2.drawLine(84, 258, 86, 261);

		g2.drawLine(274, 244, 271, 248);
		g2.drawLine(271, 248, 276, 253);
		g2.drawLine(276, 253, 276, 257);
		g2.drawLine(276, 257, 271, 261);

		g2.drawLine(137, 46, 133, 46);
		g2.drawLine(133, 46, 121, 59);
		g2.drawLine(121, 59, 121, 64);

		g2.drawLine(189, 49, 179, 59);
		g2.drawLine(179, 59, 178, 68);

		g2.drawLine(325, 104, 311, 116);
		g2.drawLine(311, 116, 303, 116);

		g2.drawLine(367, 141, 355, 149);
		g2.drawLine(355, 149, 344, 149);

		g2.drawLine(368, 173, 378, 177);
		g2.drawLine(398, 165, 391, 168);
		g2.drawLine(367, 120, 366, 130);

		g2.drawLine(355, 160, 371, 154);
		g2.drawLine(371, 154, 380, 146);
		g2.drawLine(380, 146, 381, 139);

		g2.drawLine(328, 133, 334, 134);
		g2.drawLine(334, 134, 339, 129);

		g2.drawLine(275, 95, 282, 95);
		g2.drawLine(282, 95, 286, 90);
		g2.drawLine(286, 90, 286, 85);
		g2.drawLine(286, 85, 296, 80);

		// manchas cara
		g.setColor(moradito);
		g.drawLine(177, 171, 180, 171);
		g.drawLine(177, 172, 180, 172);

		g.setColor(moradito);
		g.drawLine(170, 178, 172, 178);
		g.drawLine(170, 179, 172, 179);

		g.setColor(moradito);
		g.drawLine(165, 166, 166, 167);

	}
}

