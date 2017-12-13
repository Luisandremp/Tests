public class Algo{

	public static void main(String[] args) {		
		
		String text = "1111a1aaa1bbbbb11aPhg";
		sommeDuString(text);

		System.out.println(ordemAlphabetique("toto", "tata"));

	}

	public static int sommeDuString(String s){

		int sum = 0;
		int aCount = 0;
		int charG = 0;
		int aChainMaxCount = 0;
		int aChainCurrCount = 0;
		char charPrev = 0;
		int charChainCurr = 0;
		int charChainMax = 0;
		int nbMinis = 0;
		String newString = "";

		for (int i = 0;i < s.length() ;i++ ) {  // Get Sum of the numbers in the string
			if (Character.getNumericValue(s.charAt(i))<=9) {
				sum += Character.getNumericValue(s.charAt(i));
			}

			if (s.charAt(i) == 'a') { // Sum nb 'a'
				aCount++;	
			}

			if (s.charAt(i)>charG) { // get larger char
				charG = s.charAt(i);
			}
			
			if (s.charAt(i) == 'a'){ // get chain de a
					aChainCurrCount++;
					if (aChainMaxCount<aChainCurrCount) {
						aChainMaxCount = aChainCurrCount;
					}
			}else{
				aChainCurrCount = 0;
			}

			if (s.charAt(i) == charPrev){ // get chain de char
				charChainCurr++;
				if (charChainMax<charChainCurr) {
					charChainMax = charChainCurr;
				}
			}else{
				charChainCurr = 1;
			}
			charPrev = s.charAt(i);
			
			

			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){ // count lower case
				nbMinis++;
			}
			

			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){ // create a new String only  with  lower case
				char newChar = s.charAt(i);
				newString += newChar;
			}

			if (i%2!=0){ // create a new String witt the odd chars
				char newChar = s.charAt(i);
				newString += newChar;
			}
		}

		

		System.out.println("sum of all numbers:"+sum);
		System.out.println("nb de a: "+aCount);
		System.out.println("char + : "+ charG); 
		System.out.println("Chain d a: "+aChainMaxCount);
		System.out.println("Chain d char:"+charChainMax);
		System.out.println("nb de Miniscule :"+nbMinis);
		System.out.println("new string :"+newString);
		return sum;
	
	}

	public static String ordemAlphabetique(String s01, String s02){
		for (int i=0;i<s01.length();i++ ) {
			if(s01.charAt(i) < s02.charAt(i)){
				return s01;
			}else if (s01.charAt(i) > s02.charAt(i)){
				return s02;
			}
		}
		return s01;
	}

}

///////////////////////////////////////////////////////////////////////////  Begin Check Date /////////////////////////////////////////////////////////////////////////// 
	/*public static String checkDate(int a, int m, int j){
		if (checkJour(a,m,j)) {
			return "date bonne";
		}else{
			return "date incorrect";
		}
	}

	static boolean checkA(int a){
			return a>=0;
	}
	static boolean checkM(int m){
			return m>0 && m<13;
	}
	static boolean checkBix(int a){
		if(a%4 ==0 && (a%100 != 0 || a%400==0)){
			return true;
		}else{
			return false;
		}	
	}

	static boolean checkJour(int a, int m, int j){
		if (checkA(a)&&checkM(m)){
			if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
				return j>0 && j<32;
			}else if (m==4 ||m==6 ||m==9 ||m==11) {
				return j>0 && j<31;	
			}else{
				if (checkBix(a)) {
					return j>0 && j<30;	
				}else{
					return j>0 && j<29;
				}
			}	
		}else{
			return false;
		}
	}*/
///////////////////////////////////////////////////////////////////////////  End Check Date /////////////////////////////////////////////////////////////////////////// 

///////////////////////////////////////////////////////////////////////////  Begin Sort in Hour Minutes Seconds /////////////////////////////////////////////////////////////////////////// 

	/*public static String heureP1 (int m, int s, int sAdd){
		s += m*60+sAdd;
		m = s/60;
		int h = s/3600;
		return "il est "+h%24+"h "+m%60+"m "+s%60+"s ";
	}*/
///////////////////////////////////////////////////////////////////////////  End Sort in Hour Minutes Seconds ///////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////  Begin Sort color of auto contract ///////////////////////////////////////////////////////////////////////////
/*
String tarifAuto(int age, int agePermis, int accidents, bool ancien){
	String res;
		if(ancien){
				res = "Blue";
		}else{			
			if(age<25){
				if(agePermis<2){
					if (accidents>1) {
						res = "Refusé";
					}else{
						res = "Rouge";
					}
				}else{
					if (accidents>1) {
						res = "Refusé";
					}else if(accidents>0){
						res = "Rouge";
					}else{
						res = "Orange";
					}
				}
			}else{
				if(agePermis<2){
					if (accidents>1) {
						res = "Refusé";
					}else if(accidents>0){
						res = "Rouge";
					}else{
						res = "Orange";
					}
					}
				}else{
					if (accidents>2) {
						res = "Refusé";
					}else if(accidents>1){
						res = "Rouge";
					}else if(accidents>0){
						res = "Orange";
					}else{
						res = "Vert";
					}
				}
			}
		}
	return res;
}
*/

///////////////////////////////////////////////////////////////////////////  End Sort color of auto contract ///////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////  Begin Category d'enfant ///////////////////////////////////////////////////////////////////////////
/*
String categoryEnf(int age){
	if (age>5) {
		if(age<8){
			return "Poussin";
		}else if (age<10) {
			return "Pupille";
		}else if (age<12) {
			return "Minime";
		}else{
			return "Cadet";
		}	
	}else{
		return "Le enfant est trop jeune, essaye l'année proxenne!";
	}
}
*/
///////////////////////////////////////////////////////////////////////////  End Category d'enfant///////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////  Begin Prix Photocopy ///////////////////////////////////////////////////////////////////////////
/*
double prix1 = 0.1;
double prix2 = 0.09;
double prix3 = 0.08;

double prixPhotocopies(int nbPhotocopy){
	double res;
	if (nbPhotocopy<=10) {
		res= nbPhotocopy*prix1;
	} else if (nbPhotocopy<=30) {
		res = (10*prix1)+(nbPhotocopy-10)*prix2;
	}else{
		res = (10*prix1)+(20*prix2)+(nbPhotocopy-30)*prix3;
	}
	return res;
}


double duoPhotocopy(nb1, nb2){
	return prixPhotocopies(nb1)+prixPhotocopies(nb2);
}

*/
///////////////////////////////////////////////////////////////////////////  End Prix Photocopy ///////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////  Begin Discount du croissant ///////////////////////////////////////////////////////////////////////////
/* t

double croissantPrix= 0.75;
double discount = 0.1;

double boulangerie(int nbCroiss){
	if(nbCroiss>=20){
		croissantPrix -= discount*2;
	}
	else if(nbCroiss>=10) {
		croissantPrix -= discount;
	}else{
		croissantPrix= 0.75;
	}
	

	double res= nbCroiss*croissantPrix;
	return res;
}*/

///////////////////////////////////////////////////////////////////////////  End Discount du croissant ///////////////////////////////////////////////////////////////////////////