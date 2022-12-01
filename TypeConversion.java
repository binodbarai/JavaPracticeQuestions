class TypeConversion {

	public static void main(String[] args) {
		// Automatic type conversion
		int i = 100;
		long l = i;
		System.out.println("Int value: " + i);
		System.out.println("long value: " + l);
		// Explicit type conversion
		double d = 100.04;
		long l1 = (long) d;
		int i1 = (int) l;

		System.out.println("Doouble value: " + d);
		System.out.println("long value: " + l1);
		System.out.println("Int value: " + i1);

		// abstract to String data type
		int a = 10;
		Integer in = 5; // Integer is an abstract type of int
		System.out.println(a + in);

		String inString = in.toString();// Integer to string
		System.out.println(inString);

		Character gender = 'A';
		String genderString = gender.toString();// only abstract character to string is possible
		System.out.println(genderString);

		Byte b = 3;
		String bytestring = b.toString();// abstract Byte to string
		System.out.println(bytestring);

		// for abstract data type to premitive
		Long r = 500L;
		int s = r.intValue();
		System.out.println(s);

		// abstract data type to abstract
		Long ll = 400L;
		Integer ii = Integer.parseInt(ll.toString());// we use string here because parseInt is searching String value
														// only
		System.out.println(ii);

		// in case of string we do not need toString
		/*
		 * we cannnot pass "500L" in a string it will be an error in run time because
		 * integer value supports only 0-9. So, number formating Error will occour
		 */
		//String ss = "500";
		// Integer is = Integer.parseInt(ss);

		// avoid exception and run other program
		// we do exception handeling
		try {
			String sss = "500L";
			Integer iii = Integer.parseInt(sss);
			System.out.println(iii);
		} catch (Exception e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Good Job");

	}

}