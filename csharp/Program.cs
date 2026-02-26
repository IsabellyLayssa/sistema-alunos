Console.Write("Quantidade de alunos: ");
int n = int.Parse(Console.ReadLine());

string[] nomes = new string[n];
double[,] notas = new double[n, 5];
double[] frequencia = new double[n];
double[] media = new double[n];

for (int i = 0; i < n; i++)
{
    Console.WriteLine($"\nAluno {i + 1}:");

    Console.Write("Nome: ");
    nomes[i] = Console.ReadLine();

    double soma = 0;

    for (int j = 0; j < 5; j++)
    {
        Console.Write($"Nota {j + 1}: ");
        notas[i, j] = double.Parse(Console.ReadLine());
        soma += notas[i, j];
    }

    media[i] = soma / 5;

    Console.Write("Frequência (%): ");
    frequencia[i] = double.Parse(Console.ReadLine());
}

double[] mediaDisciplinas = new double[5];

for (int j = 0; j < 5; j++)
{
    double soma = 0;

    for (int i = 0; i < n; i++)
    {
        soma += notas[i, j];
    }

    mediaDisciplinas[j] = soma / n;
}

double mediaTurma = 0;
for (int i = 0; i < n; i++)
{
    mediaTurma += media[i];
}
mediaTurma /= n;

Console.WriteLine("\n Alunos");
for (int i = 0; i < n; i++)
{
    Console.WriteLine($"{nomes[i]} - Média: {media[i]:F1} - Frequência: {frequencia[i]}%");
}

Console.WriteLine("\n Média por disciplina");
for (int j = 0; j < 5; j++)
{
    Console.Write($"{mediaDisciplinas[j]:F1} ");
}

Console.WriteLine();

Console.WriteLine("\n Acima da média da turma");
bool encontrou = false;

for (int i = 0; i < n; i++)
{
    if (media[i] > mediaTurma)
    {
        Console.WriteLine(nomes[i]);
        encontrou = true;
    }
}

if (!encontrou)
        Console.WriteLine();

Console.WriteLine("\n Frequência abaixo de 75%");
encontrou = false;

for (int i = 0; i < n; i++)
{
    if (frequencia[i] < 75)
    {
        Console.WriteLine(nomes[i]);
        encontrou = true;
    }
}

if (!encontrou)
        Console.WriteLine();
