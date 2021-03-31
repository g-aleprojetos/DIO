using System; 

class minhaClasse {

    static void Main(string[] args) { 

      int diaInicio, diaTermino, horaMomentoInicio, minutoMomentoInicio, segundoMomentoInicio;
      int horaMomentoTermino, minutoMomentoTermino, segundoMomentoTerminio;
      string descricaoDiaInicio, descricaoDiaTermino;

      string[] descricaoInicialEvento = Console.ReadLine().Split(' ');
      descricaoDiaInicio = descricaoInicialEvento[0];
      diaInicio = Convert.ToInt32(descricaoInicialEvento[1]);

      string[] dadosMomentoInicio = Console.ReadLine().Replace(" : ", " ").Split(' ');
      horaMomentoInicio = Convert.ToInt32(dadosMomentoInicio[0]);
      minutoMomentoInicio = Convert.ToInt32(dadosMomentoInicio[1]);
      segundoMomentoInicio = Convert.ToInt32(dadosMomentoInicio[2]);

      string[] descricaoTerminoEvento = Console.ReadLine().Split(' ');
      descricaoDiaTermino = descricaoTerminoEvento[0];
      diaTermino = Convert.ToInt32(descricaoTerminoEvento[1]);

      string[] dadosMomentoTermino = Console.ReadLine().Replace(" : ", " ").Split(' ');
      horaMomentoTermino = Convert.ToInt32(dadosMomentoTermino[0]);
      minutoMomentoTermino = Convert.ToInt32(dadosMomentoTermino[1]);
      segundoMomentoTerminio = Convert.ToInt32(dadosMomentoTermino[2]);

      int segundoEventoInicio = diaInicio * 86400 + horaMomentoInicio * 3600 + minutoMomentoInicio * 60 + segundoMomentoInicio;
      int segundoEventoTermino = diaTermino * 86400 + horaMomentoTermino * 3600 + minutoMomentoTermino * 60 + segundoMomentoTerminio;
      var time = segundoEventoTermino - segundoEventoInicio;

      int resto, resultado;
      int dia = Math.DivRem(time, 86400, out resto);
      resultado = resto;
      int hora = Math.DivRem(resultado, 3600, out resto);
      resultado = resto;
      int minuto = Math.DivRem(resultado, 60, out resto);
      int segundo = resto;

      Console.WriteLine("{0} dia(s)", dia);
      Console.WriteLine("{0} hora(s)", hora);
      Console.WriteLine("{0} minuto(s)", minuto);
      Console.WriteLine("{0} segundo(s)", segundo);

    }

}
