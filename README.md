<h1 align="center"> Desenvolvimento Android 2024 - Crie 13 apps completos </h1>

## :scroll: Sobre:
Repositório para documentar o aprendizado e projetos realizados durante o curso "Desenvolvimento Android 2024 - Crie 13 apps completos".<br>

## :newspaper: ATIVIDADES:

- APP 1 -> Entendendo Encapsulamento
Aplicativo feito para demonstrar visualmente dados de 1 livro em especifico, utilizando conceitos de encapsulamento, assim aprendendo a usar de getters e setters tanto em Java quanto em Kotlin.
- [x] Em Java
- [x] Em Kotlin.

- APP 2 -> Clock Digital
Aplicativo utilizando de componentes nativos do android. Com a funcionalidade de exibir a hora atual em 2 formatos e ao usuário apertar um botão da tela, o aplicativo salvar a hora do click e então exibi-lá na tela inicial, mostrando se está a noite ou de dia, com as siglas PM ou AM respectivamente.
- [x] Em Java
- [x] Em Kotlin

- APP 3 -> Localização atual do celular.


## :scroll:
#### 26/07 - 11:53
APP 1 | Funcionamento de getters e setters em *Java*.

#### 27/07 - 11:26
APP 1 | Versão em *Java* finalizada. Dando inicio ao desenvolvimento do app em *Kotlin*.

#### 27/07 - 13:27
APP 1 | Versão em *Kotlin* finalizada. Dando inicio ao desenvolvimento do APP 2.

#### 27/07 - 14:18
APP 2 | Versão em *Java*. Iniciado o desenvolvimento do layout do aplicativo.

#### 28/07 - 20:45
APP 2 | Finalizada versão em *Java*. Iniciada a versão em Kotlin do projeto relógio. Por enquanto nada novo para se anotar.
* **Não fiz muita coisa hoje, e vai ter uma mudança no horário de estudos, visto que terá a volta as aulas no período da manhã e o curso técnico de tarde.*

#### 28/07 - 21:07
APP 2 | Finalizada versão em *Kotlin*. Por enquanto nada novo para se anotar.

#### 30/07 - 18:33
Iniciado app de cadastro em *Kotlin*. A ideia é um app de cadastro simples que já foi implementado. Portanto, a nova tarefa é adicionar um sistema para salvar as informações por meio de "sharedreferences".<br>
(Pelo que olhei na documentação do android, isso não é mais usado, porém estou seguindo o curso, após o término, buscarei me atualizar sobre as novas tecnologias usadas para desenvolver.)<br>

Também já foi implementada, porém é necessário estudar mais sobre, e ainda vai ocorrer a implementação de um sistema para visualizar o que foi salvo, ao menos para edição.

#### 31/07 - 06:06
Aplicativo agora consegue exibir a informação já salva anteriormente. Utilizando **SHAREDPREFERENCES**.

#### 27/08 - 10:35
Melhoramento do app anterior. Aprendendo a fazer um botão que exibe uma lista de opções.

#### 30/08 - 12:02
Criação do app para ver a localização atual do celular -  EM KOTLIN.

## ANOTAÇÕES
#### 30/07 - 18:56 - SISTEMA DE CADASTRO SIMPLES
**SharedPreferences (NÃO É MAIS USADO, MAS NO CURSO USA)** -> Tipo de arquivo para armazenar dados simples e temporarios no android.<br>
Minha primeira duvida foi referente a como funciona o código 
```
    var preferences : SharedPreferences? = null;
    companion object{
        private final val NOME_PREFENCES : String = "pref_lista";
    }
    var listaVip : SharedPreferences.Editor? = null;
```
**COMPANION OBJECT ->** pelo que pesquisei é oq se aproxima de algo static. <br>
```
        preferences = getSharedPreferences(NOME_PREFENCES, 0);
        listaVip = preferences!!.edit();
```
<br>

Pelo que entendi "getSharedPreferences" é um objeto filho da classe "SharedPreferences". <br>
**"NOME_PREFERENCES"** puxa de uma constante o nome que será o arquivo SharedPreferences.<br>
**"0"** o professor disse que significa que vai poder ser lido e editado, queria saber quais numeros definem oq só pode ser lido ou que só pode ser editado.<br><br>
**listaVip ->** vejo apenas como uma ferramente de edição. literalmente definida pelo objeto que quero editar e chamando a função edit. <br>
Com isso da para colocar(put) coisas dentro, como por exemplo strings, e dps salvar com .apply();
<br>
```
        listaVip!!.putString("nome", user!!.name);
        listaVip!!.apply();
```
Para pegar a informação de dentro do arquivo.

        tb_name!!.setText(preferences!!.getString("nome", ""));

<br>

#### 27/08 - 10:35 - SPINNER
```
        var spn_cursos : Spinner = findViewById(R.id.spn_cursos);

        var lista_cursos : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_item, cursoController.getNomesCursos())
        lista_cursos.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn_cursos.adapter = lista_cursos;
```
**ArrayAdapter< String >** Necessario usar, pois é um componente de exibição de array.<br>
**lista_cursos.setDropDownViewResource()** Como será a exibição.<br>
**spn_cursos.adapter = lista_cursos;** define que o spinner vai exibir o ArrayAdapter.
 
#### 30/08 - 12:02 - Binding e GPS

```
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
```
Definido no Manifest, define que o app usará essas permissões

```
        lateinit var locationManager : LocationManager;
        locationManager = application.getSystemService(LOCATION_SERVICE) as LocationManager;

        gps_ativo = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
```
faz com que locationManager use os metodos nativos do android para verificar se o gps está ativo ou não

```
    buildFeatures {
        viewBinding = true
    }
```
para ativar o binding no projeto
        
