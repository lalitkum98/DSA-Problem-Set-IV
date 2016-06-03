package ProblemSetIV;

public class StairMissing {
	public int maxStep(int start, int stairs, int[] steps, int missingStep,
			String alreadyTakenSteps,int prevStep  ) {
		if (stairs == start) {
			alreadyTakenSteps.concat("" + start);
			System.out.println(alreadyTakenSteps);
			alreadyTakenSteps = null;
			return stairs;
		}
		if (start > stairs) {
			System.out.println(alreadyTakenSteps);
			return start - prevStep;
		}
		int max = 0;
		for (int i = 0; i < steps.length; i++) {
			if (start != missingStep) {
				prevStep = steps[i];
				int ret = maxStep(start + steps[i], stairs, steps, missingStep,
						alreadyTakenSteps.concat("" + start),prevStep );
				if (ret > max) {
					max = ret;
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps[] = { 2, 3 };
		int stairs = 8;
		int missingStep = 6;
		StairMissing ad = new StairMissing();
		System.out.println(ad.maxStep(0, stairs, steps, missingStep, "",0));

	}

}
