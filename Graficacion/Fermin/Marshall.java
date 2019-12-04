package Fermin;
import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

public class Marshall extends JApplet {
	
	AffineTransform at;
	
	public void paint(Graphics g) {
		
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		
		//pata delantera der  
		g2.setColor(Color.white);
		int ax1[] = {255,250,252,229,207,198,198,192,188,185,181,181,188,195,204,215,224,215,218,220};
		int ay1[] = {333,412,421,429,431,423,428,428,423,422,418,400,388,387,384,383,386,383,373,311};
		g2.fillPolygon(ax1, ay1, ax1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(ax1,ay1,ax1.length);
		g2.drawLine(197, 421, 197,401);
		g2.drawLine(197,401,205,392);
		g2.drawLine(188,422,189,397);
		g2.drawLine(189,397,197,385);
		g2.drawLine(215,384,224,386);
		
		//pata delantera izq
		g2.setColor(Color.white);
		int bx1[] = {263,264,283,296,304,305,313,319,325,326,321,310 ,308,300,289,281,272,265,261,258,266,270,270,263};
		int by1[] = {330,317,303,303,309,339,396,398,414,441,445,446, 444,447,448,445,446,444,437,413,399,398,349,329};
		g2.fillPolygon(bx1, by1, bx1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(bx1,by1,bx1.length);
		g2.drawLine(307,444,308,412);
		g2.drawLine(308,412,304,402);
		g2.drawLine(276,397,286,393);
		g2.drawLine(286,393,298,393);
		g2.drawLine(298,393,308,395);
		g2.drawLine(281,445,278,424);
		g2.drawLine(278,424,280,408);
		g2.drawLine(284,403,280,408);
		
		//pata trasera derecha
		g2.setColor(Color.white);
		int cx1[] = {321,322,323,319,311,314,319,319,330,346,342,340,334};
		int cy1[] = {319,325,346,371,372,395,398,390,379,378,316,314,313};
		g2.fillPolygon(cx1, cy1, cx1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(cx1,cy1,cx1.length);
		g2.drawLine(320,371,326,375);
		
		//pata trasera izquierda
		g2.setColor(Color.white);
		int dx1[] = {348,363,366,388,360,345,341,336,330,329,326,326,323,319,319,332,346,345,341,340};
		int dy1[] = {267,270,273,415,425,425,422,425,421,424,423,414,403,398,390,378,378,333,315,313};
		g2.fillPolygon(dx1, dy1, dx1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(dx1,dy1,dx1.length);
		g2.drawLine(342,422,339,411);
		g2.drawLine(339,411,339,397);
		g2.drawLine(339,397,345,385);
		g2.drawLine(335,384,330,394);
		g2.drawLine(329,412,330,394);
		g2.drawLine(329,412,330,422);
		
		//cola
		g2.setColor(Color.white);
		int ex1[] = {364,374,383,392,408,404,396,383,373};
		int ey1[] = {270,278,295,307,317,319,319,315,304};
		g2.fillPolygon(ex1,ey1,ex1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(ex1,ey1,ex1.length);
		
		//cuerpo
		g2.setColor(Color.red);
		int fx1[] = {227,215,213,214,221,235,254,265,263,283,297,304,305,334,339,350,351,348,339,335,323,315,293,266,227};
		int fy1[] = {255,273,280,291,310,323,332,332,318,303,302,309,326,312,313,302,276,267,266,265,262,255,246,256,254};
		g2.fillPolygon(fx1,fy1,fx1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(fx1,fy1,fx1.length);
		g2.setColor(Color.gray);
		int gx1[] = {238,251,252,240,239};
		int gy1[] = {309,322,327,315,309};
		g2.fillPolygon(gx1,gy1,gx1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(gx1,gy1,gx1.length);
		g2.drawLine(257,328,252,327);
		g2.drawLine(235,304,238,310);
		g2.drawLine(260,332,256,325);
		g2.drawLine(258,313,256,325);
		g2.drawLine(258,313,276,298);
		g2.drawLine(283,294,276,298);
		g2.drawLine(276,298,298,294);
		g2.drawLine(310,303,298,294);
		g2.drawLine(310,303,309,315);
		g2.drawLine(309,315,305,322);
		g2.drawLine(334,313,344,298);
		g2.drawLine(344,298,345,276);
		g2.drawLine(345,276,339,265);
		g2.drawLine(337,280,340,288);
		g2.drawLine(340,288,332,293);
		g2.drawLine(332,293,326,294);
		g2.drawLine(326,294,317,291);
		g2.drawLine(317,291,314,282);
		g2.drawLine(314,282,337,280);
		g2.drawLine(318,292,318,306);
		g2.drawLine(318,306,339,297);
		g2.drawLine(339,297,339,288);
		
		//collar
		g2.setColor(Color.yellow);
		int hx1[] = {286,286,267,247,234,231,231,228,226,226,227,268,293,292,288};
		int hy1[] = {228,233,238,239,240,238,232,234,239,249,254,255,247,231,227};
		g2.fillPolygon(hx1,hy1,hx1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(hx1,hy1,hx1.length);
		
		g2.setColor(Color.gray);
		int ix1[] = {238,236,244,245};
		int iy1[] = {239,250,251,240};
		g2.fillPolygon(ix1,iy1,ix1.length);
		
		int jx1[] = {231,247,248,252,254,259,259,247,237,224,224,230,232};
		int jy1[] = {251,251,253,253,259,265,272,290,289,275,263,257,250};
		g2.fillPolygon(jx1,jy1,jx1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(jx1,jy1,jx1.length);
		g2.drawLine(247,252,247,257);
		g2.drawLine(247,257,254,266);
		g2.drawLine(254,266,252,272);
		g2.drawLine(252,272,240,289);
		
		
		g2.setColor(Color.red);
		int kx1[] = {234,243,245,249,249,237,227,227,232,234};
		int ky1[] = {254,255,262,266,271,286,272,265,261,254};
		g2.fillPolygon(kx1,ky1,kx1.length);
		
		g2.setColor(Color.yellow);
		int lx1[] = {237,239,239,244,244,240,245,236,231,235,235};
		int ly1[] = {261,264,268,265,269,273,272,279,270,271,266};
		g2.fillPolygon(lx1,ly1,lx1.length);
		
		//mochila
		g2.setColor(Color.red);
		int mx1[] = {379,389,390,389,377,378,334,330,326,305,303,299,296,286,286,290,293,293,291,316,322,335,378,389};
		int my1[] = {272,258,249,239,237,229,215,216,211,214,218,219,221,220,227,227,232,243,245,256,261,264,271,258};
		g2.fillPolygon(mx1,my1,mx1.length);
		
		
		g2.setColor(Color.gray);
		int nx1[] = {299,297,297,299,320,326,324,299};
		int ny1[] = {235,238,244,246,249,244,236,235};
		g2.fillPolygon(nx1,ny1,nx1.length);
		
		g2.setColor(Color.black);
		g2.drawPolygon(nx1,ny1,nx1.length);
		g2.drawPolygon(mx1,my1,mx1.length);
		g2.drawLine(333,215,334,225);
		g2.drawLine(334,225,378,237);
		g2.drawLine(296,220,315,223);
		g2.drawLine(315,223,319,229);
		g2.drawLine(334,215,297,220);
		g2.drawLine(333,225,319,229);
		g2.drawLine(319,229,314,235);
		g2.drawLine(314,247,315,254);
		g2.drawLine(315,254,325,262);
		g2.drawLine(325,262,334,263);
		g2.drawLine(334,263,348,251);
		g2.drawLine(348,251,348,237);
		g2.drawLine(334,225,348,237);
		
		//cabeza
		g2.setColor(Color.white);
		int ox1[] = {188,170,170,178,183,191,221,231,231,257,286,287,311,318,323,364,363,327,290,186};
		int oy1[] = {121,152,181,202,203,189,226,229,239,240,232,212,185,198,199,160,153,114,111,120};
		g2.fillPolygon(ox1,oy1,ox1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(ox1,oy1,ox1.length);
		g2.drawLine(187,122,185,165);
		g2.drawLine(185,165,181,175);
		g2.drawLine(181,175,217,224);
		g2.drawLine(228,228,217,224);
		g2.drawLine(228,228,248,228);
		g2.drawLine(248,228,269,218);
		g2.drawLine(292,111,304,142);
		g2.drawLine(304,142,313,190);
		
		//ojos
		g2.drawLine(196,132,207,131);
		g2.drawLine(207,131,216,142);
		g2.drawLine(216,142,213,160);
		g2.drawLine(196,132,190,143);
		g2.drawLine(190,143,189,155);
		g2.drawLine(189,155,196,165);
		g2.drawLine(269,125,279,139);
		g2.drawLine(279,139,279,151);
		g2.drawLine(279,151,266,164);
		g2.drawLine(266,164,252,162);
		g2.drawLine(252,162,241,149);
		g2.drawLine(241,149,241,136);
		g2.drawLine(241,136,254,125);
		g2.drawLine(254,125,269,125);
		g2.setColor(Color.blue);
		int px1[] = {215,206,198,198,208};
		int py1[] = {142,138,147,155,162};
		int rx1[] = {262,273,273,266,258,250,250};
		int ry1[] = {134,140,151,158,158,152,141};
		g2.fillPolygon(px1,py1,px1.length);
		g2.fillPolygon(rx1,ry1,rx1.length);
		g2.setColor(Color.black);
		int sx1[] = {216,207,201,201,207,215};
		int sy1[] = {143,143,148,156,161,160};
		int tx1[] = {257,267,270,271,267,258,253,254,257};
		int ty1[] = {139,139,143,151,154,154,150,144,140};
		g2.fillPolygon(sx1,sy1,sx1.length);
		g2.fillPolygon(tx1,ty1,tx1.length);
		
		//nariz y boca
		g2.setColor(Color.gray);
		int wx1[] = {220,205,193,193,207,220};
		int wy1[] = {165,163,168,176,186,173};
		g2.fillPolygon(wx1,wy1,wx1.length);
		g2.setColor(Color.pink);
		int ax2[] = {268,234,220,222,229};
		int ay2[] = {183,211,211,204,198};
		g2.fillPolygon(ax2,ay2,ax2.length);
		g2.setColor(Color.white);
		int xx1[] = {217,213,211};
		int xy1[] = {168,173,169};
		int zx1[] = {253,254,249,247,244};
		int zy1[] = {187,194,198,198,192};
		g2.fillPolygon(xx1,xy1,xx1.length);
		g2.fillPolygon(zx1,zy1,zx1.length);
		g2.setColor(Color.red);
		int yx1[] = {228,211,211,220,221};
		int yy1[] = {198,198,205,212,205};
		g2.fillPolygon(yx1,yy1,yx1.length);
		g2.setColor(Color.black);
		g2.drawPolygon(wx1,wy1,wx1.length);
		g2.drawPolygon(ax2,ay2,ax2.length);
		g2.drawPolygon(xx1,xy1,xx1.length);
		g2.drawPolygon(zx1,zy1,zx1.length);
		g2.drawPolygon(yx1,yy1,yx1.length);
		g2.drawLine(236,163,232,161);
		g2.drawLine(232,161,209,160);
		g2.drawLine(209,160,204,163);
		g2.drawLine(193,175,192,184);
		g2.drawLine(192,184,204,198);
		g2.drawLine(204,198,211,198);
		g2.drawLine(207,186,207,189);
		g2.drawLine(207,189,214,198);
		
		//cejas
		int bx2[] = {187,192,198,208,208,204,197,188};
		int by2[] = {130,130,127,128,124,120,120,127};
		int cx2[] = {265,244,244,247,255,266};
		int cy2[] = {121,122,117,115,114,119};
		g2.fillPolygon(bx2,by2,bx2.length);
		g2.fillPolygon(cx2,cy2,cx2.length);
		
		//caashcoooo
		g2.setColor(Color.red);
		int dx2[] = {343,360,361,329,329,303,301,283,281,267,264,257,224,207,206,194,184,189,174,181,139,139,147,180,188,286,328};
		int dy2[] = {130,121,114,101,95, 77 , 72, 57, 57, 51, 49, 48, 29, 30, 49, 51, 65, 81, 91,106,121,130,135,137,121,110,115};
		g2.fillPolygon(dx2,dy2,dx2.length);
		g2.setColor(Color.DARK_GRAY);
		int ex2[] = {329,329,303,292,285,285,291,329};
		int ey2[] = {100,95 , 75, 75, 83, 91,100,100};
		g2.fillPolygon(ex2,ey2,ex2.length);
		g2.setColor(Color.yellow);
		int fx2[] = {251,250,292,287};
		int fy2[] = {94, 100,100, 93};
		g2.fillPolygon(fx2,fy2,fx2.length);
		g2.setColor(Color.LIGHT_GRAY);
		int gx2[] = {305,299,293,289,289,293,299};
		int gy2[] = {88 , 81, 81, 85, 90, 95, 95};
		int hx2[] = {220,199,199,191,197,214,229,230,223};
		int hy2[] = {56,  59, 66, 72, 85, 97, 80, 66,63};
		
		g2.fillPolygon(gx2,gy2,gx2.length);
		g2.fillPolygon(hx2,hy2,hx2.length);
		
		g2.setColor(Color.GRAY);
		int ix2[] = {217,202,201,196,196,213,225,225,221};
		int iy2[] = {61,  63, 68, 73, 77, 93, 76, 68, 67};		
		g2.fillPolygon(ix2,iy2,ix2.length);
		g2.setColor(Color.LIGHT_GRAY);
		int mx2[] = {204,204,200,199};
		int my2[] = {77,  73, 73,77};
		int jx2[] = {210,211,207,205,205};
		int jy2[] = {73, 67 ,67 , 69, 72};
		int kx2[] = {219,214,214,218,219};
		int ky2[] = {68,  68, 72, 73,71};
		int lx2[] = {210,213,214,219,220,216,209,206,206};
		int ly2[] = {88 , 85,82 , 82, 77, 74,75 ,78 ,84};
		g2.fillPolygon(mx2,my2,mx2.length);
		g2.fillPolygon(jx2,jy2,jx2.length);
		g2.fillPolygon(kx2,ky2,kx2.length);
		g2.fillPolygon(lx2,ly2,lx2.length);
		g2.setColor(Color.black);
		g2.drawPolygon(fx2,fy2,fx2.length);
		g2.drawPolygon(ix2,iy2,ix2.length);
		g2.drawPolygon(hx2,hy2,hx2.length);
		g2.drawPolygon(ex2,ey2,ex2.length);
		g2.drawPolygon(dx2,dy2,dx2.length);
		g2.drawPolygon(gx2,gy2,gx2.length);
		g2.drawPolygon(jx2,jy2,jx2.length);
		g2.drawPolygon(kx2,ky2,kx2.length);
		g2.drawPolygon(lx2,ly2,lx2.length);
		g2.drawPolygon(mx2,my2,mx2.length);
		g2.drawLine(218,29,223,47);
		g2.drawLine(257,48,232,47);
		g2.drawLine(206,49,223,47);
		g2.drawLine(223,47,230,46);
		g2.drawLine(230,46,242,58);
		g2.drawLine(242,58,243,72);
		g2.drawLine(243,72,257,79);
		g2.drawLine(257,79,249,99);
		g2.drawLine(278,55,286,71);
		g2.drawLine(286,71,287,80);
		g2.drawLine(265,49,275,62);
		g2.drawLine(275,62,279,80);
		g2.drawLine(279,80,279,92);
		g2.drawLine(267,92,266,72);
		g2.drawLine(266,72,261,58);
		g2.drawLine(261,58,254,55);
		g2.drawLine(225,47,236,59);
		g2.drawLine(236,59,237,75);
		g2.drawLine(237,75,250,81);
		g2.drawLine(250,81,244,99);
		g2.drawLine(181,107,229,100);
		g2.drawLine(229,100,329,101);
		g2.drawLine(151,129,148,127);
		g2.drawLine(148,127,147,125);
		g2.drawLine(147,125,232,108);
		g2.drawLine(232,108,311,106);
		g2.drawLine(311,106,353,118);
		g2.drawLine(302,76,309,83);
		g2.drawLine(309,83,310,92);
		g2.drawLine(310,92,304,100);
		
		//manchas
		int nx2[] = {220,226,228,232,236,235,239,239,234,233,224,223,220};
		int ny2[] = {330,332,327,327,331,337,338,345,346,352,353,350,350};
		int ox2[] = {219,224,230,232,227,229,229,223,220,217};
		int oy2[] = {358,364,363,369,371,373,376,377,374,375};
		int px2[] = {280,281,283,291,293,293,300,301,301,296,298,298,296,291,289,286,285,280,280,276,274,274,276,280};
		int py2[] = {345,337,334,334,336,342,343,345,348,354,357,361,363,363,359,359,362,361,354,354,352,347,346,345};
		int qx2[] = {283,289,290,293,293,297,299,299,302,302,300,294,292,286,284,286,282};
		int qy2[] = {370,370,372,371,370,370,372,378,381,384,385,385,388,387,382,380,377};
		int rx2[] = {374,370,365,362,362,354,354,358,363,364,367,367,373,376,375};
		int ry2[] = {308,306,306,308,312,316,323,328,328,327,326,328,327,326,313};
		int sx2[] = {360,353,352,355,356,354,355,361,363,365,366,371,370,366,366,368,368,364,360,360};
		int sy2[] = {344,344,350,351,354,356,360,360,356,356,359,356,349,349,346,345,343,340,341,344};
		int tx2[] = {369,371,371,374,374,371,371,363,360,360,362,365,366};
		int ty2[] = {367,368,371,372,377,378,380,379,376,374,372,371,369};
		int wx2[] = {382,378,378,380,381,381,385,391,391,396};
		int wy2[] = {293,294,300,300,301,307,311,311,309,309};
		int xx2[] = {180,182,182,180,179,182,182,177,176,171,169,171};
		int xy2[] = {133,137,144,148,150,153,157,158,163,166,167,151};
		int yx2[] = {280,286,288,289,293,297,299,299,297,293,293,290,287,283,283,278};
		int yy2[] = {160,160,163,163,160,159,162,169,172,172,180,182,182,179,173,169};
		int zx2[] = {327,316,315,323,323,330,339,341,343,344,349,350};
		int zy2[] = {114,117,126,131,137,142,143,139,139,140,140,138};
		int ax3[] = {339,339,342,345,345,348,352,354,357,360,359,357,353,352,349};
		int ay3[] = {150,157,160,160,163,164,164,161,157,156,150,149,149,146,146};
		
		g2.fillPolygon(nx2,ny2,nx2.length);
		g2.fillPolygon(ox2,oy2,ox2.length);
		g2.fillPolygon(px2,py2,px2.length);
		g2.fillPolygon(qx2,qy2,qx2.length);
		g2.fillPolygon(rx2,ry2,rx2.length);
		g2.fillPolygon(sx2,sy2,sx2.length);
		g2.fillPolygon(tx2,ty2,tx2.length);
		g2.fillPolygon(wx2,wy2,wx2.length);
		g2.fillPolygon(xx2,xy2,xx2.length);
		g2.fillPolygon(yx2,yy2,yx2.length);
		g2.fillPolygon(zx2,zy2,zx2.length);
		g2.fillPolygon(ax3,ay3,ax3.length);
		
	}
		
		

	

}
