/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angga
 */
import java.util.Date;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date ();
        ArrayList<Pegawai> listPegawai = new ArrayList<Pegawai>();
        DecimalFormat df = new DecimalFormat ("#,###");
        
        Gaji[] gaji = new Gaji[419];
        
        
        gaji[0] = new Gaji("IA",1486500,0);
        gaji[1] = new Gaji("IA",1486500,1);
        gaji[2] = new Gaji("IA",1533400,2);
        gaji[3] = new Gaji("IA",1533400,3);
        gaji[4] = new Gaji("IA",1581700,4);
        gaji[5] = new Gaji("IA",1581700,5);
        gaji[6] = new Gaji("IA",1631500,6);
        gaji[7] = new Gaji("IA",1631500,7);
        gaji[8] = new Gaji("IA",1682900,8);
        gaji[9] = new Gaji("IA",1682900,9);
        gaji[10] = new Gaji("IA",1735900,10);
        gaji[11] = new Gaji("IA",1735900,11);
        gaji[12] = new Gaji("IA",1790500,12);
        gaji[13] = new Gaji("IA",1790500,13);
        gaji[14] = new Gaji("IA",1846900,14);
        gaji[15] = new Gaji("IA",1846900,15);
        gaji[16] = new Gaji("IA",1905100,16);
        gaji[17] = new Gaji("IA",1905100,17);
        gaji[18] = new Gaji("IA",1965100,18);
        gaji[19] = new Gaji("IA",1965100,19);
        gaji[20] = new Gaji("IA",202700,20);
        gaji[21] = new Gaji("IA",202700,21);
        gaji[22] = new Gaji("IA",2090800,22);
        gaji[23] = new Gaji("IA",2090800,23);
        gaji[24] = new Gaji("IA",2156700,24);
        gaji[25] = new Gaji("IA",2156700,25);
        gaji[26] = new Gaji("IA",2224600,26);
        gaji[27] = new Gaji("IA",2224600,27);
        
        gaji[28] = new Gaji("IB",1623500,0);
        gaji[29] = new Gaji("IB",1623500,1);
        gaji[30] = new Gaji("IB",1623500,2);
        gaji[31] = new Gaji("IB",1623400,3);
        gaji[32] = new Gaji("IB",1623400,4);
        gaji[33] = new Gaji("IB",1674500,5);
        gaji[34] = new Gaji("IB",1674500,6);
        gaji[35] = new Gaji("IB",1727300,7);
        gaji[36] = new Gaji("IB",1727300,8);
        gaji[37] = new Gaji("IB",1781700,9);
        gaji[38] = new Gaji("IB",1781700,10);
        gaji[39] = new Gaji("IB",1837800,11);
        gaji[40] = new Gaji("IB",1837800,12);
        gaji[41] = new Gaji("IB",1895700,13);
        gaji[42] = new Gaji("IB",1895700,14);
        gaji[43] = new Gaji("IB",1955400,15);
        gaji[44] = new Gaji("IB",1955400,16);
        gaji[45] = new Gaji("IB",1955400,16);
        gaji[46] = new Gaji("IB",2016900,17);
        gaji[47] = new Gaji("IB",2016900,18);
        gaji[48] = new Gaji("IB",2080500,19);
        gaji[49] = new Gaji("IB",2080500,20);
        gaji[50] = new Gaji("IB",2146000,21);
        gaji[51] = new Gaji("IB",2146000,22);
        gaji[52] = new Gaji("IB",2213600,23);
        gaji[53] = new Gaji("IB",2213600,24);
        gaji[54] = new Gaji("IB",2283300,25);
        gaji[55] = new Gaji("IB",2283300,26);
        gaji[56] = new Gaji("IB",2355200,27);
        
        gaji[57] = new Gaji("IC",1692100,0);
        gaji[58] = new Gaji("IC",1692100,1);
        gaji[59] = new Gaji("IC",1692100,2);
        gaji[60] = new Gaji("IC",1692100,3);
        gaji[61] = new Gaji("IC",1692100,4);
        gaji[62] = new Gaji("IC",1745400,5);
        gaji[63] = new Gaji("IC",1745400,6);
        gaji[64] = new Gaji("IC",1800300,7);
        gaji[65] = new Gaji("IC",1800300,8);
        gaji[66] = new Gaji("IC",1857000,9);
        gaji[67] = new Gaji("IC",1857000,10);
        gaji[68] = new Gaji("IC",1915500,11);
        gaji[69] = new Gaji("IC",1915500,12);
        gaji[70] = new Gaji("IC",1975800,13);
        gaji[71] = new Gaji("IC",1975800,14);
        gaji[72] = new Gaji("IC",2038100,15);
        gaji[73] = new Gaji("IC",2038100,16);
        gaji[74] = new Gaji("IC",2102300,17);
        gaji[75] = new Gaji("IC",2102300,18);
        gaji[76] = new Gaji("IC",2168500,19);
        gaji[77] = new Gaji("IC",2168500,20);
        gaji[78] = new Gaji("IC",2236800,21);
        gaji[79] = new Gaji("IC",2236800,22);
        gaji[80] = new Gaji("IC",2307200,23);
        gaji[81] = new Gaji("IC",2307200,24);
        gaji[82] = new Gaji("IC",2379900,25);
        gaji[83] = new Gaji("IC",2379900,26);
        gaji[84] = new Gaji("IC",2454800,27);
        
        gaji[85] = new Gaji("ID",1763600,0);
        gaji[86] = new Gaji("ID",1763600,1);
        gaji[87] = new Gaji("ID",1763600,2);
        gaji[88] = new Gaji("ID",1763600,3);
        gaji[89] = new Gaji("ID",1763600,4);
        gaji[90] = new Gaji("ID",1819200,5);
        gaji[91] = new Gaji("ID",1819200,6);
        gaji[92] = new Gaji("ID",1876500,7);
        gaji[93] = new Gaji("ID",1876500,8);
        gaji[94] = new Gaji("ID",1935600,9);
        gaji[95] = new Gaji("ID",1935600,10);
        gaji[96] = new Gaji("ID",19996500,11);
        gaji[97] = new Gaji("ID",19996500,12);
        gaji[98] = new Gaji("ID",2059400,13);
        gaji[99] = new Gaji("ID",2059400,14);
        gaji[100] = new Gaji("ID",2124300,15);
        gaji[101] = new Gaji("ID",2124300,16);
        gaji[102] = new Gaji("ID",2191200,17);
        gaji[103] = new Gaji("ID",2191200,18);
        gaji[104] = new Gaji("ID",2260200,19);
        gaji[105] = new Gaji("ID",2260200,20);
        gaji[106] = new Gaji("ID",2331400,21);
        gaji[107] = new Gaji("ID",2331400,22);
        gaji[108] = new Gaji("ID",2404800,23);
        gaji[109] = new Gaji("ID",2404800,24);
        gaji[110] = new Gaji("ID",2480500,25);
        gaji[111] = new Gaji("ID",2480500,26);
        gaji[112] = new Gaji("ID",2558700,27);
        
        gaji[113] = new Gaji("IIA",1926000,0);
        gaji[114] = new Gaji("IIA",1956300,1);
        gaji[115] = new Gaji("IIA",1956300,2);
        gaji[116] = new Gaji("IIA",2017900,3);
        gaji[117] = new Gaji("IIA",2017900,4);
        gaji[118] = new Gaji("IIA",2081500,5);
        gaji[119] = new Gaji("IIA",2081500,6);
        gaji[120] = new Gaji("IIA",2147000,7);
        gaji[121] = new Gaji("IIA",2147000,8);
        gaji[122] = new Gaji("IIA",2214700,9);
        gaji[123] = new Gaji("IIA",2214700,10);
        gaji[124] = new Gaji("IIA",2284400,11);
        gaji[125] = new Gaji("IIA",2284400,12);
        gaji[126] = new Gaji("IIA",2356400,13);
        gaji[127] = new Gaji("IIA",2356400,14);
        gaji[128] = new Gaji("IIA",2430600,15);
        gaji[129] = new Gaji("IIA",2430600,16);
        gaji[130] = new Gaji("IIA",2507100,17);
        gaji[131] = new Gaji("IIA",2507100,18);
        gaji[132] = new Gaji("IIA",2586100,19);
        gaji[133] = new Gaji("IIA",2586100,20);
        gaji[134] = new Gaji("IIA",2667500,21);
        gaji[135] = new Gaji("IIA",2667500,22);
        gaji[136] = new Gaji("IIA",2751600,23);
        gaji[137] = new Gaji("IIA",2751600,24);
        gaji[138] = new Gaji("IIA",2838200,25);
        gaji[139] = new Gaji("IIA",2838200,26);
        gaji[140] = new Gaji("IIA",2927600,27);
        gaji[141] = new Gaji("IIA",2927600,28);
        gaji[142] = new Gaji("IIA",3019800,29);
        gaji[143] = new Gaji("IIA",3019800,30);
        gaji[144] = new Gaji("IIA",3114900,31);
        gaji[145] = new Gaji("IIA",3114900,32);
        gaji[146] = new Gaji("IIA",3213100,33);
        
        gaji[147] = new Gaji("IIB",2103300,0);
        gaji[148] = new Gaji("IIB",2103300,1);
        gaji[149] = new Gaji("IIB",2103300,2);
        gaji[150] = new Gaji("IIB",2103300,3);
        gaji[151] = new Gaji("IIB",2103300,4);
        gaji[152] = new Gaji("IIB",2169500,5);
        gaji[153] = new Gaji("IIB",2169500,6);
        gaji[154] = new Gaji("IIB",2237900,7);
        gaji[155] = new Gaji("IIB",2237900,8);
        gaji[156] = new Gaji("IIB",2308300,9);
        gaji[157] = new Gaji("IIB",2381100,11);
        gaji[158] = new Gaji("IIB",2381100,12);
        gaji[159] = new Gaji("IIB",2456000,13);
        gaji[160] = new Gaji("IIB",2456000,14);
        gaji[161] = new Gaji("IIB",2533400,15);
        gaji[162] = new Gaji("IIB",2533400,16);
        gaji[163] = new Gaji("IIB",2613200,17);
        gaji[164] = new Gaji("IIB",2613200,18);
        gaji[165] = new Gaji("IIB",2695500,19);
        gaji[166] = new Gaji("IIB",2695500,20);
        gaji[167] = new Gaji("IIB",2780400,21);
        gaji[168] = new Gaji("IIB",2780400,22);
        gaji[169] = new Gaji("IIB",2867900,23);
        gaji[170] = new Gaji("IIB",2867900,24);
        gaji[171] = new Gaji("IIB",2985300,25);
        gaji[172] = new Gaji("IIB",2985300,26);
        gaji[173] = new Gaji("IIB",3051400,27);
        gaji[174] = new Gaji("IIB",3051400,28);
        gaji[175] = new Gaji("IIB",3147600,29);
        gaji[176] = new Gaji("IIB",3147600,30);
        gaji[177] = new Gaji("IIB",3246700,31);
        gaji[178] = new Gaji("IIB",3246700,32);
        gaji[179] = new Gaji("IIB",3348900,33);
        
        gaji[180] = new Gaji("IIC",2192300,0);
        gaji[181] = new Gaji("IIC",2192300,1);
        gaji[182] = new Gaji("IIC",2192300,2);
        gaji[183] = new Gaji("IIC",2192300,3);
        gaji[184] = new Gaji("IIC",2192300,4);
        gaji[185] = new Gaji("IIC",2261300,5);
        gaji[186] = new Gaji("IIC",2261300,6);
        gaji[187] = new Gaji("IIC",2332500,7);
        gaji[188] = new Gaji("IIC",2332500,8);
        gaji[189] = new Gaji("IIC",2406000,9);
        gaji[190] = new Gaji("IIC",2406000,10);
        gaji[191] = new Gaji("IIC",2481800,11);
        gaji[192] = new Gaji("IIC",2481800,12);
        gaji[193] = new Gaji("IIC",2559900,13);
        gaji[194] = new Gaji("IIC",2559900,14);
        gaji[195] = new Gaji("IIC",2640600,15);
        gaji[196] = new Gaji("IIC",2640600,16);
        gaji[197] = new Gaji("IIC",2723700,17);
        gaji[198] = new Gaji("IIC",2723700,18);
        gaji[199] = new Gaji("IIC",2809500,19);
        gaji[200] = new Gaji("IIC",2809500,20);
        gaji[201] = new Gaji("IIC",2898000,21);
        gaji[202] = new Gaji("IIC",2898000,22);
        gaji[203] = new Gaji("IIC",2989300,23);
        gaji[204] = new Gaji("IIC",2989300,24);
        gaji[205] = new Gaji("IIC",3083400,25);
        gaji[206] = new Gaji("IIC",3083400,26);
        gaji[207] = new Gaji("IIC",3180500,27);
        gaji[208] = new Gaji("IIC",3180500,28);
        gaji[209] = new Gaji("IIC",3280700,29);
        gaji[210] = new Gaji("IIC",3280700,30);
        gaji[211] = new Gaji("IIC",3384000,31);
        gaji[212] = new Gaji("IIC",3384000,32);
        gaji[213] = new Gaji("IIC",3490600,33);
        
        gaji[214] = new Gaji("IID",2285000,0);
        gaji[215] = new Gaji("IID",2285000,1);
        gaji[216] = new Gaji("IID",2285000,2);
        gaji[217] = new Gaji("IID",2285000,3);
        gaji[218] = new Gaji("IID",2285000,4);
        gaji[219] = new Gaji("IID",2357000,5);
        gaji[220] = new Gaji("IID",2357000,6);
        gaji[221] = new Gaji("IID",2431200,7);
        gaji[222] = new Gaji("IID",2431200,8);
        gaji[223] = new Gaji("IID",2507800,9);
        gaji[224] = new Gaji("IID",2507800,10);
        gaji[225] = new Gaji("IID",2586700,11);
        gaji[226] = new Gaji("IID",2586700,12);
        gaji[227] = new Gaji("IID",2668200,13);
        gaji[228] = new Gaji("IID",2668200,14);
        gaji[229] = new Gaji("IID",2752300,15);
        gaji[230] = new Gaji("IID",2752300,16);
        gaji[231] = new Gaji("IID",2838900,17);
        gaji[232] = new Gaji("IID",2838900,18);
        gaji[233] = new Gaji("IID",2928300,19);
        gaji[234] = new Gaji("IID",2928300,20);
        gaji[235] = new Gaji("IID",3020600,21);
        gaji[236] = new Gaji("IID",3020600,22);
        gaji[237] = new Gaji("IID",3115700,23);
        gaji[238] = new Gaji("IID",3115700,24);
        gaji[239] = new Gaji("IID",3213800,25);
        gaji[240] = new Gaji("IID",3213800,26);
        gaji[241] = new Gaji("IID",3315100,27);
        gaji[242] = new Gaji("IID",3315100,28);
        gaji[243] = new Gaji("IID",3419500,29);
        gaji[244] = new Gaji("IID",3419500,30);
        gaji[245] = new Gaji("IID",3527200,31);
        gaji[246] = new Gaji("IID",3527200,32);
        gaji[247] = new Gaji("IID",3638200,33);
        
        gaji[248] = new Gaji("IIIA",2456700,0);
        gaji[249] = new Gaji("IIIA",2456700,1);
        gaji[250] = new Gaji("IIIA",2534000,2);
        gaji[251] = new Gaji("IIIA",2534000,3);
        gaji[252] = new Gaji("IIIA",2613800,4);
        gaji[253] = new Gaji("IIIA",2613000,5);
        gaji[254] = new Gaji("IIIA",2696200,6);
        gaji[255] = new Gaji("IIIA",2696200,7);
        gaji[256] = new Gaji("IIIA",2781100,8);
        gaji[257] = new Gaji("IIIA",2781100,9);
        gaji[258] = new Gaji("IIIA",2868700,10);
        gaji[259] = new Gaji("IIIA",2868700,11);
        gaji[260] = new Gaji("IIIA",2959000,12);
        gaji[261] = new Gaji("IIIA",2959000,13);
        gaji[262] = new Gaji("IIIA",3052300,14);
        gaji[263] = new Gaji("IIIA",3052300,15);
        gaji[264] = new Gaji("IIIA",3281300,16);
        gaji[265] = new Gaji("IIIA",3281300,17);
        gaji[266] = new Gaji("IIIA",3247500,18);
        gaji[267] = new Gaji("IIIA",3247500,19);
        gaji[268] = new Gaji("IIIA",3346800,20);
        gaji[269] = new Gaji("IIIA",3346800,21);
        gaji[270] = new Gaji("IIIA",3455300,22);
        gaji[271] = new Gaji("IIIA",3455300,23);
        gaji[272] = new Gaji("IIIA",3564100,24);
        gaji[273] = new Gaji("IIIA",3564100,25);
        gaji[274] = new Gaji("IIIA",3676400,26);
        gaji[275] = new Gaji("IIIA",3676400,27);
        gaji[276] = new Gaji("IIIA",3792100,28);
        gaji[277] = new Gaji("IIIA",3792100,29);
        gaji[278] = new Gaji("IIIA",3911600,30);
        gaji[279] = new Gaji("IIIA",3911600,31);
        gaji[280] = new Gaji("IIIA",4034800,32);
        
        gaji[281] = new Gaji("IIIB",2560000,0);
        gaji[282] = new Gaji("IIIB",2560000,1);
        gaji[283] = new Gaji("IIIB",2641200,2);
        gaji[284] = new Gaji("IIIB",2641200,3);
        gaji[285] = new Gaji("IIIB",2724400,4);
        gaji[286] = new Gaji("IIIB",2724400,5);
        gaji[287] = new Gaji("IIIB",2810200,6);
        gaji[288] = new Gaji("IIIB",2810200,7);
        gaji[289] = new Gaji("IIIB",2898700,8);
        gaji[290] = new Gaji("IIIB",2898700,9);
        gaji[291] = new Gaji("IIIB",2990000,10);
        gaji[292] = new Gaji("IIIB",2990000,11);
        gaji[293] = new Gaji("IIIB",3084200,12);
        gaji[294] = new Gaji("IIIB",3084200,13);
        gaji[295] = new Gaji("IIIB",3181300,14);
        gaji[296] = new Gaji("IIIB",3181300,15);
        gaji[297] = new Gaji("IIIB",3281500,16);
        gaji[298] = new Gaji("IIIB",3281500,17);
        gaji[299] = new Gaji("IIIB",3384900,18);
        gaji[300] = new Gaji("IIIB",3384900,19);
        gaji[301] = new Gaji("IIIB",3491500,20);
        gaji[302] = new Gaji("IIIB",3491500,21);
        gaji[303] = new Gaji("IIIB",3601400,22);
        gaji[304] = new Gaji("IIIB",3601400,23);
        gaji[305] = new Gaji("IIIB",3714900,24);
        gaji[306] = new Gaji("IIIB",3714900,25);
        gaji[307] = new Gaji("IIIB",3831900,26);
        gaji[308] = new Gaji("IIIB",3831900,27);
        gaji[309] = new Gaji("IIIB",3952600,28);
        gaji[310] = new Gaji("IIIB",3952600,29);
        gaji[311] = new Gaji("IIIB",4007000,30);
        gaji[312] = new Gaji("IIIB",4007000,31);
        gaji[313] = new Gaji("IIIB",4205400,32);
        
        gaji[314] = new Gaji("IIIC",2668900,0);
        gaji[315] = new Gaji("IIIC",2668900,1);
        gaji[316] = new Gaji("IIIC",2752900,2);
        gaji[317] = new Gaji("IIIC",2752900,3);
        gaji[318] = new Gaji("IIIC",2839700,4);
        gaji[319] = new Gaji("IIIC",2839700,5);
        gaji[320] = new Gaji("IIIC",2929100,6);
        gaji[321] = new Gaji("IIIC",2929100,7);
        gaji[322] = new Gaji("IIIC",3021300,8);
        gaji[323] = new Gaji("IIIC",3021300,9);
        gaji[324] = new Gaji("IIIC",3116500,10);
        gaji[325] = new Gaji("IIIC",3116500,11);
        gaji[326] = new Gaji("IIIC",3214700,12);
        gaji[327] = new Gaji("IIIC",3214700,13);
        gaji[328] = new Gaji("IIIC",3315900,14);
        gaji[329] = new Gaji("IIIC",3315900,15);
        gaji[330] = new Gaji("IIIC",3420300,16);
        gaji[331] = new Gaji("IIIC",3420300,17);
        gaji[332] = new Gaji("IIIC",3528100,18);
        gaji[333] = new Gaji("IIIC",3528100,19);
        gaji[334] = new Gaji("IIIC",3639200,20);
        gaji[335] = new Gaji("IIIC",3639200,21);
        gaji[336] = new Gaji("IIIC",3753800,22);
        gaji[337] = new Gaji("IIIC",3753800,23);
        gaji[338] = new Gaji("IIIC",3872000,24);
        gaji[339] = new Gaji("IIIC",3872000,25);
        gaji[340] = new Gaji("IIIC",3994200,26);
        gaji[341] = new Gaji("IIIC",3994200,27);
        gaji[342] = new Gaji("IIIC",4119700,28);
        gaji[343] = new Gaji("IIIC",4119700,29);
        gaji[344] = new Gaji("IIIC",4249500,30);
        gaji[345] = new Gaji("IIIC",4249500,31);
        gaji[346] = new Gaji("IIIC",4383300,32);
        
        gaji[347] = new Gaji("IIID",2781800,0);
        gaji[348] = new Gaji("IIID",2781800,1);
        gaji[349] = new Gaji("IIID",2869400,2);
        gaji[350] = new Gaji("IIID",2869400,3);
        gaji[351] = new Gaji("IIID",2959800,4);
        gaji[352] = new Gaji("IIID",2959800,5);
        gaji[353] = new Gaji("IIID",3053000,6);
        gaji[354] = new Gaji("IIID",3053000,7);
        gaji[355] = new Gaji("IIID",3149100,8);
        gaji[356] = new Gaji("IIID",3149100,9);
        gaji[357] = new Gaji("IIID",3248300,10);
        gaji[358] = new Gaji("IIID",3248300,11);
        gaji[359] = new Gaji("IIID",3350600,12);
        gaji[360] = new Gaji("IIID",3350600,13);
        gaji[361] = new Gaji("IIID",3456200,14);
        gaji[362] = new Gaji("IIID",3456200,15);
        gaji[363] = new Gaji("IIID",3565000,16);
        gaji[364] = new Gaji("IIID",3565000,17);
        gaji[365] = new Gaji("IIID",3677300,18);
        gaji[366] = new Gaji("IIID",3677300,19);
        gaji[367] = new Gaji("IIID",3912600,20);
        gaji[368] = new Gaji("IIID",3912600,21);
        gaji[369] = new Gaji("IIID",3912600,22);
        gaji[370] = new Gaji("IIID",3912600,23);
        gaji[371] = new Gaji("IIID",4035800,24);
        gaji[372] = new Gaji("IIID",4035800,25);
        gaji[373] = new Gaji("IIID",4162900,26);
        gaji[374] = new Gaji("IIID",4162900,27);
        gaji[375] = new Gaji("IIID",4294000,28);
        gaji[376] = new Gaji("IIID",4294000,29);
        gaji[377] = new Gaji("IIID",4429300,30);
        gaji[378] = new Gaji("IIID",4429300,31);
        gaji[379] = new Gaji("IIID",4568800,32);
        
        gaji[380] = new Gaji("IVA",2899500,0);
        gaji[381] = new Gaji("IVA",2899500,1);
        gaji[382] = new Gaji("IVA",2990800,2);
        gaji[383] = new Gaji("IVA",2990800,3);
        gaji[384] = new Gaji("IVA",3085000,4);
        gaji[385] = new Gaji("IVA",3085000,5);
        gaji[386] = new Gaji("IVA",3182100,6);
        gaji[387] = new Gaji("IVA",3182100,7);
        gaji[388] = new Gaji("IVA",3282400,8);
        gaji[389] = new Gaji("IVA",3282400,9);
        gaji[390] = new Gaji("IVA",3385700,10);
        gaji[391] = new Gaji("IVA",3385700,11);
        gaji[392] = new Gaji("IVA",3492400,12);
        gaji[393] = new Gaji("IVA",3492400,13);
        gaji[394] = new Gaji("IVA",3602400,14);
        gaji[395] = new Gaji("IVA",3602400,15);
        gaji[396] = new Gaji("IVA",3715800,16);
        gaji[397] = new Gaji("IVA",3715800,17);
        gaji[398] = new Gaji("IVA",3832800,18);
        gaji[399] = new Gaji("IVA",3832800,19);
        gaji[400] = new Gaji("IVA",3953600,20);
        gaji[401] = new Gaji("IVA",3953600,21);
        gaji[402] = new Gaji("IVA",4078100,22);
        gaji[403] = new Gaji("IVA",4078100,23);
        gaji[404] = new Gaji("IVA",4206500,24);
        gaji[405] = new Gaji("IVA",4206500,25);
        gaji[406] = new Gaji("IVA",4339000,26);
        gaji[407] = new Gaji("IVA",4339000,27);
        gaji[408] = new Gaji("IVA",4475700,28);
        gaji[409] = new Gaji("IVA",4475700,29);
        gaji[410] = new Gaji("IVA",4616600,30);
        gaji[411] = new Gaji("IVA",4616600,31);
        gaji[412] = new Gaji("IVA",4762000,32);
        gaji[413] = new Gaji("IVB",3022100,0);
        gaji[414] = new Gaji("IVB",3022100,1);
        gaji[415] = new Gaji("IVB",3117300,2);
        gaji[416] = new Gaji("IVB",3117300,3);
        gaji[417] = new Gaji("IVC",3149900,0);
        gaji[418] = new Gaji("IVD",3283200,0);
        
        Scanner in = new Scanner(System.in);
        
        String nip, nama, golongan = null;
        int masaKerja = 0, anak = 0, menu = 0, bolos = 0, cuti = 0;
        char menikah, alesan = 0;
        String UlangDariAwal;
        boolean cek_nip = true;
        boolean aslino = true;
        boolean ngaran = true;
        boolean valid_menu = true;
        double pajak = 0.0125;
        boolean valid_pegawai = true;
        char validp;
        double beras = 82500;
        boolean valid_anak = true;
        boolean valid_menikah = true;
        boolean valid_masa_kerja = true;
        int test = 0;
        boolean valid_ulang = true;
        boolean valid_gol = true;
        
        for (UlangDariAwal = "Y"; UlangDariAwal.equalsIgnoreCase("y");) {
            in.reset();
            System.out.println ("");
            System.out.println (" ███▓▓▓▒▒▒▒░░░░░┌ ╔         ╗ ┐░░░░░▒▒▒▒▓▓▓███");
            System.out.println (" ███▓▓▓▒▒▒▒░░░░░├ ╣ M E N U ╠ ┤░░░░░▒▒▒▒▓▓▓███");
            System.out.println (" ███▓▓▓▒▒▒▒░░░░░└ ╚         ╝ ┘░░░░░▒▒▒▒▓▓▓███");
            System.out.println ("||----------------------------------------------------------------||");
            System.out.println ("|| 1. Informasi Gaji & Tunjangan || 4. Cetak Gaji seluruh Pegawai ||");
            System.out.println ("||-------------------------------||------------------------------ ||");
            System.out.println ("|| 2. Entry Data PNS             || 5. Data PNS                   ||");
            System.out.println ("||-------------------------------||------------------------------ ||");
            System.out.println ("|| 3. Kalkulasi Gaji PNS         || 6. Keluar Program             ||");
            System.out.println ("||_______________________________||_______________________________||");
            
            do {
            System.out.print ("Harap Masukan Menu yang anda Pilih : ");
                try { menu = in.nextInt();
                    in.nextLine();
                }
                catch (Exception e){
                    System.err.println ("Harap Masukan yang benar");
                    in.nextLine();
                }
               }while (menu <0 || menu >6);
            System.out.println ();
            
            
                        
            
            switch(menu){
                case 1:
                {
                    System.out.println ("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");   
                    System.out.println ("■                        DATA GAJI BERDASARKAN GOLONGAN                    ■");
                    System.out.println ("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                    System.out.println ("|Masa Kerja | IA            | IB            | IC             | ID             |");
                    System.out.println ("|0          | Rp. 1486500   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|1          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|2          | Rp. 1533400   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|3          | Rp.           | Rp.  1623400  | Rp. 1692100    | Rp. 1763600    |");
                    System.out.println ("|4          | Rp. 1581700   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|5          | Rp.           | Rp.  1674500  | Rp.  1674500   | Rp. 1819200    |");
                    System.out.println ("|6          | Rp. 1631500   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|7          | Rp.           | Rp.  1727300  | Rp.  1800100   | Rp. 1876500    |");
                    System.out.println ("|8          | Rp. 1682900   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|9          | Rp.           | Rp.  1781700  | Rp.  1857000   | Rp. 1935600    |");
                    System.out.println ("|10         | Rp. 1735900   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|11         | Rp.           | Rp.  1837800  | Rp.  1837800   | Rp. 1996500    |");
                    System.out.println ("|12         | Rp. 1790500   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|13         | Rp.           | Rp.  1895700  | Rp.  1975800   | Rp. 2059400    |");
                    System.out.println ("|14         | Rp. 1846900   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|15         | Rp.           | Rp.  1955400  | Rp.  2018100   | Rp. 2124300    |");
                    System.out.println ("|16         | Rp. 1905100   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|17         | Rp.           | Rp.  2016900  | Rp.  2102300   | Rp. 2191200    |");
                    System.out.println ("|18         | Rp. 1945100   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|19         | Rp.           | Rp.  2080500  | Rp.  2168500   | Rp. 2260200    |");
                    System.out.println ("|20         | Rp. 2027000   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|21         | Rp.           | Rp.  2146000  | Rp.  2236800   | Rp. 2331400    |");
                    System.out.println ("|22         | Rp. 2090800   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|23         | Rp.           | Rp.  2213600  | Rp.  2307200   | Rp. 2404800    |");
                    System.out.println ("|24         | Rp. 2156700   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|25         | Rp.           | Rp.  2283300  | Rp.  2379900   | Rp. 2480500    |");
                    System.out.println ("");
                    System.out.println ("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");   
                    System.out.println ("■                        DATA GAJI BERDASARKAN GOLONGAN                    ■");
                    System.out.println ("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
                    
                    System.out.println ("|Masa Kerja | IIA           | IIB           | IIC            | IID            |");
                    System.out.println ("|0          | Rp. 1926000   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|1          | Rp. 1956300   | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|2          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|3          | Rp. 2017900   | Rp. 2103300   | Rp. 2192300    | Rp. 2285000    |");
                    System.out.println ("|4          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|5          | Rp. 2081500   | Rp.  2169500  | Rp.  2261300   | Rp. 2357000    |");
                    System.out.println ("|6          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|7          | Rp. 2147000   | Rp.  2237900  | Rp.  2332500   | Rp. 2431200    |");
                    System.out.println ("|8          | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|9          | Rp. 2214700   | Rp.  2308300  | Rp.  2406000   | Rp. 2507800    |");
                    System.out.println ("|10         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|11         | Rp. 2284400   | Rp.  2381100  | Rp.  2481800   | Rp. 2587700    |");
                    System.out.println ("|12         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|13         | Rp. 2356400   | Rp.  2456000  | Rp.  2559900   | Rp. 2668200    |");
                    System.out.println ("|14         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|15         | Rp. 2430600   | Rp.  2533400  | Rp.  2640600   | Rp. 2752300    |");
                    System.out.println ("|16         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|17         | Rp. 2507100   | Rp.  2613200  | Rp.  2723700   | Rp. 2838900    |");
                    System.out.println ("|18         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|19         | Rp. 2586100   | Rp.  2695500  | Rp.  2809500   | Rp. 2928300    |");
                    System.out.println ("|20         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|21         | Rp. 2667500   | Rp.  2780400  | Rp.  2898000   | Rp. 3020600    |");
                    System.out.println ("|22         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|23         | Rp. 2751600   | Rp.  2867900  | Rp.  2989300   | Rp. 3115700    |");
                    System.out.println ("|24         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|25         | Rp. 2838200   | Rp.  2958300  | Rp.  3083400   | Rp. 3213800    |");
                    System.out.println ("|26         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|27         | Rp. 2927600   | Rp.  3051400  | Rp.  3180500   | Rp. 3315100    |");
                    System.out.println ("|28         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|29         | Rp. 3019800   | Rp.  3147600  | Rp.  3280700   | Rp. 3419500    |");
                    System.out.println ("|30         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|31         | Rp. 3114900   | Rp.  3246700  | Rp.  3384000   | Rp. 3527200    |");
                    System.out.println ("|32         | Rp.           | Rp.           | Rp.            | Rp.            |");
                    System.out.println ("|33         | Rp. 3213100   | Rp.  3348900  | Rp.  3490600   | Rp. 3638200    |");

                    System.out.println ("");
                    System.out.println ("• Tunjangan Jabatan disesuaikan dengan golongan");
                    System.out.println ("• Tunjangan Anak : 2% dari gaji pokok");
                    System.out.println ("• Tunjangan Menikah : 10% dari gaji pokok");
                    System.out.println ("• Tunjangan Beras : 10 Kg dari Harga Beras Bulog (Rp.82500)");
                    System.out.println ("► Sanksi Absensi apabila dengan keterangan : Rp.25000");
                    System.out.println ("► Sanksi Absensi apabila tidak ada keterangan : Rp.50000");
                    System.out.println ("► Pajak Penghasilan 15% per Tahun / 1.25% per Bulan");
                    System.out.println ("");
                    System.out.println ("============================== DATA TAHUN 2018 ================================");
                    System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println (" ");
                    do {
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                    try {UlangDariAwal = in.next();
                    if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                            valid_ulang = true;
                        }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                            System.exit (0);
                            in.nextLine();
                        }else {
                            System.err.println ("aweuaweu");
                            valid_ulang = false;
                        }
                        
                    }catch (Exception e){
                        System.err.println ("Hanya Y atau N!");
                        in.nextLine();
                    }
                    } while (valid_ulang == false);
                    in.nextLine();
                }
                break;
                case 2:
                {
                    do {
                    System.out.println ("");
                    System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println ("                     ENTRY DATA PEGAWAI PNS     ");
                    System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println ("     =========> MASUKAN DATA DENGAN HURUF KAPITAL <==========");
                    System.out.println ("        =========> NIP PEGAWAI JANGAN KELIRU <==========");
                    System.out.println (" ");
                    do {
                    System.out.print ("Masukan Nama                    : ");
                    nama = in.nextLine();
                     if(nama.matches("[a-z A-Z]*")){
                            ngaran = true;
                        }else {
                            ngaran = false;
                            System.err.println("Harap Masukan Data dengan Benar!");
                        }
                    }while (ngaran==false);
                    
                    do {
                    do {
                    System.out.print ("Masukan NIP PNS                 : ");
                    nip = in.nextLine();
                        if(nip.matches("[0-9]*")){
                            aslino = true;
                        }
                        else {
                            aslino = false;
                            System.err.println("Harap Masukan Data dengan Benar!");
                        }
                        }while (aslino ==false);
                    
                            if (nip.length()==10){
                                cek_nip = true;
                            }else {
                                cek_nip = false;
                                System.err.println ("NIP harus 10 digit");
                            }
                    }while (cek_nip == false);
                    
                    do {
                    System.out.print ("Masukan Golongan                : ");   
                    try { golongan = in.next();
                        if ("IA".equals(golongan) || "IB".equals(golongan) || "IC".equals(golongan) || "ID".equals(golongan) || "IIA".equals(golongan)|| "IIB".equals(golongan)|| "IIC".equals(golongan)|| "IID".equals(golongan)|| "IIIA".equals(golongan)|| "IIIB".equals(golongan)|| "IIIC".equals(golongan)|| "IIID".equals(golongan)|| "IVA".equals(golongan)|| "IVB".equals(golongan)|| "IVC".equals(golongan)|| "IVD".equals(golongan)){
                            valid_gol = true;
                        }else {
                            valid_gol = false;
                            System.err.println("Harap masukan golongan yang benar!");
                            in.nextLine();
                        }
                    }
                    catch (Exception e){
                        System.err.println ("Tidak boleh dengan angka");
                    }
                    }while (valid_gol == false);
                    
                    do {
                    System.out.print ("Masukan Tahun Masa Kerja        : ");
                    try {masaKerja = in.nextInt();
                        if (masaKerja >25){
                            System.err.println ("Tidak Ada");
                            in.nextLine();
                            valid_masa_kerja = false;
                        }else{
                            valid_masa_kerja = true;
                        }
                    }
                    catch (Exception e){
                          System.err.println ("Hanya bisa diinput angka!");
                          in.nextLine ();
                    }
                    }while (valid_masa_kerja == false);
                    
                    do {
                    System.out.print ("Status Menikah (Y/N)            : ");
                    menikah = in.next().charAt (0);
                    if(menikah == 'Y' || menikah == 'y' || menikah == 'N' || menikah == 'n'){
                            valid_menikah = true;
                        }else {
                            valid_menikah = false;
                        }
                    } while (valid_menikah == false); 
                    
                    do { //catch untuk validasi input integer
                    System.out.print ("Jumlah anak                     : ");   
                    try { anak = in.nextInt();
                          in.nextLine ();
                    }
                    catch (Exception e){
                          System.err.println ("Hanya bisa diinput angka!");
                          in.nextLine ();
                    }
                    }while (anak <0);
                    
                    
                    
                    System.out.print ("Apakah data sudah benar? (Y/N)  : ");
                    validp = in.next().charAt (0);
                    in.nextLine ();
                    if(validp == 'Y' || validp == 'y' ){
                            valid_pegawai = true;
                        }else {
                            valid_pegawai = false;
                            System.err.println ("Masukan yang benar");
                        }
                    } while (valid_pegawai == false);

                    Pegawai pegawai = new Pegawai(nip,nama,golongan,masaKerja,menikah,anak);
                    listPegawai.add(pegawai);
                    System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                    System.out.println ("Data sudah Disimpan!");
                    
                    do {
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                    try {UlangDariAwal = in.next();
                    if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                            valid_ulang = true;
                        }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                            System.exit (0);
                            in.nextLine();
                        }else {
                            System.err.println ("aweuaweu");
                            valid_ulang = false;
                        }
                        
                    }catch (Exception e){
                        System.out.println ("Hanya Y atau N!");
                        in.nextLine();
                    }
                    } while (valid_ulang == false);
                    in.nextLine();
                }
                break;
                case 3:
                {
                    System.out.println ("---------------------------------------------------");
                    System.out.print   ("Masukan NIP PNS                 : ");
                    nip = in.nextLine();
                    
                    System.out.print ("Masukan Jumlah hari tidak Masuk : ");
                    bolos =in.nextInt();
                    
                    System.out.print ("Alasan tidak masuk: 1.Cuti");
                    System.out.print ("                    2.yang lainnya");
                    cuti = in.nextInt();
                    
                    if (cuti == 2){
                            if (bolos >0){
                                System.out.print ("Sudah Mengajukan Surat izin? (Y/N):");
                                alesan = in.next().charAt (0);
                            }else if (bolos>30){
                                System.out.print ("Maaf Gaji tidak bisa diproses karena masalah kehadiran");
                                System.out.print ("Harap Hubungi Admin Dinas");
                            }
                    }
                    Pegawai findP = findPegawai(listPegawai,nip);
                    if(findP != null ){
                        int findGol = searchGolongan(findP.getGolongan(),findP.getMasaKerja(),gaji);
                        
                        double tunjangan = tunjanganGaji(findP.getGolongan(), gaji[findGol].getGajiPokok());
                        double tunjanganak = tunjangan_anak (findP.getAnak(),gaji[findGol].getGajiPokok());
                        double nikah = tunjangan_istri (findP.getMenikah(),gaji[findGol].getGajiPokok());
                        double pajak_penghasilan = pajakPenghasilan (pajak,gaji[findGol].getGajiPokok());
                        double sanksi_absen = sanksiabsen (bolos,alesan,cuti);
                        
                        double total = tunjangan + gaji[findGol].getGajiPokok() + tunjanganak + beras - sanksi_absen - pajak_penghasilan;
                        System.out.println ("");
                        System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                        System.out.println ("              PERHITUNGAN GAJI PEGAWAI PNS     ");
                        System.out.println ("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                        System.out.println ("                              "+date.toString());
                        System.out.println ("");
                        System.out.println ("Gaji Pokok         : Rp"+df.format(gaji[findGol].getGajiPokok()));
                        System.out.println ("Tunjangan Pokok    : Rp"+df.format(tunjangan));
                        System.out.println ("Tunjangan Istri    : Rp"+df.format (nikah));
                        System.out.println ("Tunjangan Beras    : Rp"+df.format (beras));
                        System.out.println ("Tunjangan Anak     : Rp" +df.format (tunjanganak));
                        System.out.println ("");
                        System.out.println ("Sanksi Absensi     : Rp" +df.format(sanksi_absen));
                        System.out.println ("Potongan Pajak     : Rp" +df.format(pajak_penghasilan));
                        System.out.println ("");
                        System.out.println ("Gaji Bersih        : Rp"+df.format(total));
                        System.out.println ("=========================================================");
                        System.out.println (" ");
                    }else{
                        System.out.println ("Data Pegawai Tidak Ditemukan");
                    }
                    do {
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                    try {UlangDariAwal = in.next();
                    if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                            valid_ulang = true;
                        }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                            System.exit (0);
                            in.nextLine();
                        }else {
                            System.err.println ("aweuaweu");
                            valid_ulang = false;
                        }
                        
                    }catch (Exception e){
                        System.out.println ("Hanya Y atau N!");
                        in.nextLine();
                    }
                    } while (valid_ulang == false);
                    in.nextLine();
                }
                break;
                case 4:{
                    
                    int i = 1;
                    
                    for(Pegawai pegawai : listPegawai){
                        System.out.println ("=========================================================================================");
                        System.out.println ("                                     PERINCIAN PENGHASILAN        ");
                        System.out.println ("                                      PEGAWAI NEGERI SIPIL         ");
                        System.out.println ("                                     -----------------------"      );
                        System.out.println ("");
                        System.out.println (" Yang Bertanda tangan dibawah ini:");
                        System.out.println ("       Nama    : ANGGA KURNIA PRATAMA");
                        System.out.println ("       Jabatan : BENDAHARA DINAS KAB. BANDUNG");
                        System.out.println ("");
                        System.out.println ("       Menerangkan bahwa sdr. "+pegawai.getNip()+ " sebagai Pegawai di Instansi Dinas");
                        System.out.println (" Telah menerima Gaji pada tanggal "+date.toString()+". dengan rincian sebagai Berikut:");
                        System.out.println ("");
                        System.out.println("No.: "+i);
                        System.out.println("");
                        System.out.println("NIP      : "+pegawai.getNip());
                        System.out.println("Nama     : "+pegawai.getNama());
                        System.out.println("Golongan : "+pegawai.getGolongan());
                        System.out.println (" ");
                        
                        int findGol = searchGolongan(pegawai.getGolongan(),pegawai.getMasaKerja(),gaji);
                        double tunjangan = tunjanganGaji(pegawai.getGolongan(), gaji[findGol].getGajiPokok());
                        double tunjanganak = tunjangan_anak (pegawai.getAnak(),gaji[findGol].getGajiPokok());
                        double nikah = tunjangan_istri (pegawai.getMenikah(),gaji[findGol].getGajiPokok());
                        double pajak_penghasilan = pajakPenghasilan (pajak,gaji[findGol].getGajiPokok());
                        double sanksi_absen = sanksiabsen (bolos,alesan, cuti);
                        double total = tunjangan + gaji[findGol].getGajiPokok() + tunjanganak + beras - sanksi_absen - pajak_penghasilan;
                        
                        System.out.println ("Gaji Pokok                                             : Rp"+df.format(gaji[findGol].getGajiPokok()));
                        System.out.println ("");
                        System.out.println ("Tunjangan");
                        System.out.println ("A. Tunjangan Jabatan                                   : Rp"+df.format(tunjangan));
                        System.out.println ("B. Tunjangan Istri                                     : Rp"+df.format(nikah));
                        System.out.println ("C. Tunjangan Anak                                      : Rp" +df.format(tunjanganak));
                        System.out.println ("D. Tunjangan Beras                                     : Rp" +df.format(beras));
                        System.out.println ("");
                        System.out.println ("Potongan-potongan");
                        System.out.println ("A. Sanksi Absensi                                      : Rp" +df.format(sanksi_absen));
                        System.out.println ("B. Potongan Pajak                                      : Rp" +df.format(pajak_penghasilan));
                        System.out.println ("");
                        System.out.println ("=========================================================================================");
                        System.out.println ("Penghasilan Bersih                                     : Rp"+df.format(total));
                        System.out.println ("=========================================================================================");
                        System.out.println ("");
                        System.out.println ("     Mengetahui karyawan                               Bendaharawan    ");
                        System.out.println ("     yang bersangkutan                                                  ");
                        System.out.println ("");
                        System.out.println ("");
                        System.out.println ("     "+pegawai.getNama()+"                           Angga Kurnia Pratama");
                        System.out.println ("    " +pegawai.getNip()+"                               1236547890");
                        System.out.println (" ");
                        i++;
                    
                    }
                    
                    do {
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                    try {UlangDariAwal = in.next();
                    if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                            valid_ulang = true;
                        }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                            System.exit (0);
                            in.nextLine();
                        }else {
                            System.err.println ("aweuaweu");
                            valid_ulang = false;
                        }
                        
                    }catch (Exception e){
                        System.out.println ("Hanya Y atau N!");
                        in.nextLine();
                    }
                    } while (valid_ulang == false);
                    in.nextLine();
                }
                break;
                case 5:{
                    if(listPegawai.isEmpty()){
                    System.out.println("Belum ada data pegawai");
                    } else {
                     int i = 1;
                     for(Pegawai pegawai : listPegawai){
                        System.out.println("------------------------------------------");
                        System.out.println("No:"+i);
                        System.out.println("NIP            : "+pegawai.getNip());
                        System.out.println("Nama           : "+pegawai.getNama());
                        System.out.println("Golongan       : "+pegawai.getGolongan());
                        System.out.println("Status Menikah : "+pegawai.getMenikah());
                        System.out.println("Anak           : "+pegawai.getAnak());
                        System.out.println("------------------------------------------");
                        i++;
                     }
                      do {
                        System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) : ");
                        try {UlangDariAwal = in.next();
                        if("Y".equals(UlangDariAwal) || "y".equals(UlangDariAwal)){
                                valid_ulang = true;
                            }else if("N".equals(UlangDariAwal) || "n".equals(UlangDariAwal)){
                                System.exit (0);
                                in.nextLine();
                            }else {
                                System.err.println ("aweuaweu");
                                valid_ulang = false;
                            }

                        }catch (Exception e){
                            System.out.println ("Hanya Y atau N!");
                            in.nextLine();
                        }
                        } while (valid_ulang == false);
                        in.nextLine();
                 }
                    
                }
                break;
                case 6:{
                    System.exit (0);
                }break;
                default:{
                    System.out.print("Apakah anda ingin kembali ke menu awal ? (Y/N) :");
                    UlangDariAwal = in.next();
                    in.nextLine();
                }
                break;        
            }
        }
        
    }
    
    public static double tunjangan_istri (char menikah, double gaji){
        double result =0;
        if (menikah == 'Y'){
            result = gaji*0.1;
        }    
        else{
            result=0;
        }
        return result;
              
    }
    public static double pajakPenghasilan (double pajak, double gaji){
        double result = 0;
        result = pajak*gaji;
        return result;
    }
    public static double tunjangan_anak (int anak, double gaji){
        double result =0;
        if (anak >1){
            result = anak*0.02*gaji;
        }
        else{
            result=0;
        }
        return result;
    }
    public static double sanksiabsen (int bolos,char alesan, int cuti){
        double result =0;
        if (alesan == 'Y'){
            result = bolos*25000;
        }else if(cuti == 1) {
            result = 0;
        }
        else{
        result = bolos*50000;
        }
        return result;
    }
    
    public static double tunjanganGaji(String gol,double gaji){
        
        double result = 0;
        switch (gol) {
            case "IA":
                result = 175000;
                break;
            case "IB":
                result = 175000;
                break;
            case "IC":
                result = 175000; //tambah deui
                break;
            case "ID":
                result = 175000;
                break;
            case "IIA":
                result = 180000;
                break;
            case "IIB":
                result = 180000; //tambah deui
                break;
            case "IIC":
                result = 180000;
                break;
            case "IID":
                result = 180000;
                break;
            case "IIIA":
                result = 185000; //tambah deui
                break;
            case "1IIB":
                result = 185000;
                break;
            case "IIIC":
                result = 185000;
                break;
            case "IIID":
                result = 185000; //tambah deui
                break;
            case "IVA":
                result = 190000;
                break;
            case "IVB":
                result = 190000;
                break;
            case "IVC":
                result = 190000; //tambah deui
                break; 
            case "IVD":
                result = 190000;
                break;
        }
        
        return result;
    }
    
    public static Pegawai findPegawai(ArrayList<Pegawai> listPegawai,String nip){
        Pegawai tempPegawai = new Pegawai();
        
        for(Pegawai pegawai: listPegawai){
            if(pegawai.getNip().equals(nip)){
                tempPegawai = pegawai;
                
            }else{
                tempPegawai = null;
            }
        }
        return tempPegawai;
    
    }
    
    private static int searchGolongan(String str,int mas, Gaji[] data){
        int i = 0;
        int status = 0;
        int index = -1;
        
        while(i<data.length && status==0){
            if(data[i].getGolongan().equals(str) && data[i].getMasaKerja() == mas){
                status=1;//berhenti
                index = i;
                
            }else{
                i++;
                
            }
        }
        
        return index;
        
    }
        
     private String getTanggal(){
        DateFormat dateFormat= new SimpleDateFormat ("yyyy/MM/dd");
        Date date = new Date ();
        return dateFormat.format (date);
    }

    private String getWaktu () {
        DateFormat dateFormat = new SimpleDateFormat ("HH:mm:ss");
        Date date = new Date ();
        return dateFormat.format (date);
    }
}
