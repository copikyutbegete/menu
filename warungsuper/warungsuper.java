package warungsuper;

import java.util.Scanner;

public class warungsuper {
	private void welcome() {
    }

	public static void main(String[] args) {
		
		 Scanner input;
	        String textInBold = "";
	        System.out.print("\033[0;1m"+textInBold);
	        
	        char  ulang;
	        int pilih,jumlah;
	        double total;
	        Nasgor nsg = new Nasgor();
	        Nasduk nsd = new Nasduk();
	        Naskun nsk = new Naskun();
	        Naskuc nsc = new Naskuc();
	        Nasor nsr = new Nasor();
	        Nasmgl mgl = new Nasmgl();
	        
	        do {
	        	input = new Scanner(System.in);
	            warungsuper DM = new warungsuper();
	            DM.welcome();
	     
		
		System.out.println("Warung Makan");
		System.out.println("Super Endul");
		System.out.println("----------------");
		System.out.println("1. Nasi Goreng....Rp 10.000");
		System.out.println("2. Nasi Uduk.......Rp 8.000");
		System.out.println("3. Nasi Kuning.....Rp 6.000");
		System.out.println("4. Nasi Kucing.....Rp 5.000");
		System.out.println("5. Nasi Orak-arik..Rp 9.000");
		System.out.println("6. Magelangan.....Rp 11.000");
		System.out.println("7. Keluar");
		System.out.println("----------------");
		System.out.print("Pilih [1-7] :");
		pilih=input.nextInt();
		switch(pilih) {
		
		case 1:
			nsg.setNama("Nasi Goreng");
			nsg.Infodaftarmenu();
			System.out.println("Nasi Goreng, berapa porsi = ");
			nsg.setjml1(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah seharga Rp."+nsg.getT1());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
		case 2:
			nsd.setNama("Nasi Uduk");
			nsd.Infodaftarmenu();
			System.out.println("Nasi Uduk, berapa porsi = ");
			nsd.setjml2(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah seharga Rp."+nsd.getT2());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
		case 3:
			nsk.setNama("Nasi Kuning");
			nsk.Infodaftarmenu();
			System.out.println("Nasi Kuning, berapa porsi = ");
			nsk.setjml3(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah seharga Rp."+nsk.getT3());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
		case 4:
			nsc.setNama("Nasi Kucing");
			nsc.Infodaftarmenu();
			System.out.println("Nasi Kucing, berapa porsi =");
			nsc.setjml4(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah seharga Rp."+nsc.getT4());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;

		case 5:
			nsr.setNama("Nasi Orak-Arik");
			nsr.Infodaftarmenu();
			System.out.println("Nasi Orak-Arik, berapa porsi =");
			nsr.setjml5(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah seharga Rp."+nsr.getT5());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
			
		case 6:
			mgl.setNama("Magelangan");
			mgl.Infodaftarmenu();
			System.out.println("Magelangan, beli berapa porsi =");
			mgl.setjml6(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah seharga Rp."+mgl.getjml6());
            System.out.println("Ditambahkan ke dalam pesanan");
            break;
            
		case 7:
			 System.out.println();
			 System.out.println("Tidak jadi membeli, tidak punya uang !");
			 System.out.println();
	         System.exit(0);
	         
		}
		System.out.println();
        System.out.println("Ingin Menambah Pesanan? / Mengakhiri Pesanan ?");
                System.out.print("Ya untuk menambah pesanan (enter : y) atau Mengakhiri(enter : t) ? : ");
                ulang = input.next().charAt(0);
                System.out.println();
                System.out.print("\u001B[2J");
                
            }
            while (ulang !='t');
            total=(nsg.getT1()+nsd.getT2()+nsk.getT3()+nsc.getT4()+nsr.getT5()+mgl.getT6());
            System.out.println("Keseluruhan Menu yang Telah Anda Pesan");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1. Nasi Goreng Seharga Rp.10.000 sebanyak "+nsg.getjml1()+" porsi, dengan total harga Rp."+nsg.getT1());
            System.out.println();
            System.out.println("2. Nasi Uduk seharga Rp.8.000 sebanyak "+nsd.getjml2()+" porsi, dengan total harga Rp."+nsd.getT2());
            System.out.println();
            System.out.println("3. Nasi Kuning seharga Rp.6.000 sebanyak "+nsk.getjml3()+" porsi, dengan total harga Rp."+nsk.getT3());
            System.out.println();
            System.out.println("4. Mie Kucing seharga Rp.5.000 sebanyak "+nsc.getjml4()+" porsi, dengan total harga Rp."+nsc.getT4());
            System.out.println();
            System.out.println("5. Nasi Orak-Arik seharga Rp.9.000 sebanyak "+nsr.getjml5()+" porsi, dengan total harga Rp."+nsr.getT5());
            System.out.println();
            System.out.println("6. Magelangan seharga Rp.11.000 sebanyak "+mgl.getjml6()+" porsi, dengan total harga Rp."+mgl.getT6());
            System.out.println();
            System.out.println();
            System.out.println("Total Seluruh Tagihan yang di Bayar Rp."+total);
            System.out.println();
            System.out.println("Terimakasih Telah Datang Dan Memesan Di Warung Makan Super");
            System.out.println();
            input.close();
	}


	}
