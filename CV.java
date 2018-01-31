public class CV {
	private String nom;
	private String prenom;
	private String formation;
	private int experiance;
	private String[] competences;
	private String attentes;
	
	public CV(String nom, String prenom, String formation, int experiance, String[] competences, String attentes) {
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.experiance = experiance;
		this.competences = competences;
		this.attentes = attentes;
	}
	
	public void affiche() {
		System.out.println("nom : " + nom);
		System.out.println("prénom : " + prenom);
		System.out.println("formation : " + formation);
		
		System.out.println("Nombre d'année d'expérience : " + experiance);
		for ( String string : competences ) {
			System.out.print("compétences : ");
			System.out.println( "     " + string );
		}
		System.out.println( "Attentes du cours : " + attentes + "\n");
	}
}