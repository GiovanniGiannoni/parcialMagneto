# parcialMagneto

<h2>Tabla de Contenido</h2>
<ol>
  <li><a href="#descripción">Descripción</a></li>
  <li><a href="#tecnologías">Tecnologías</a></li>
  <li><a href="#instalación-y-despliegue">Instalación y Despliegue</a>
    <ul>
      <li><a href="#despliegue-en-la-nube">Despliegue en la nube</a></li>
    </ul>
  </li>
  <li><a href="#uso">Uso</a>
    <ul>
      <li><a href="#api-local-o-render">API Local o Render</a></li>
    </ul>
  </li>
  <li><a href="#ejemplos">Ejemplos</a></li>
  <li><a href="#pruebas">Pruebas</a></li>
</ol>

<h2 id="descripción">Descripción</h2>
<p>
  Este proyecto implementa una API para detectar si una secuencia de DNA pertenece a un mutante o no. El sistema recibe una cadena de DNA y aplica reglas predefinidas para identificar patrones mutantes.generar estadísticas en tiempo real sobre la cantidad de humanos y mutantes procesados.
</p>

<h2 id="tecnologías">Tecnologías</h2>
<p>
  Las tecnologías usadas para desarrollar este proyecto incluyen:
  <ul>
    <li><strong>Java 17</strong></li>
    <li><strong>Spring Boot</strong></li>
    <li><strong>Gradle</strong> para la gestión de dependencias y automatización de compilaciones</li>
    <li><strong>H2 Database</strong> (base de datos en memoria) para persistencia de datos</li>
    <li><strong>JPA/Hibernate</strong> para manejo de la base de datos</li>
    <li><strong>Mockito y JUnit</strong> para pruebas unitarias</li>
    <li><strong>Docker</strong> Contenedores y despliegue</li>
    <li><strong>Cloud Platform</strong> Render para el despliegue en la nube</li>
  </ul>
</p>

<h2 id="instalación-y-despliegue">Instalación y Despliegue</h2>

<h3>Instalación</h3>
<ol>
  <li>Clona este repositorio:
    <pre><code>git clone https://github.com/tu_usuario/proyecto-mutantes.git</code></pre>
  </li>
  <li>Navega al directorio del proyecto:
    <pre><code>cd proyecto-mutantes</code></pre>
  </li>
  <li>Ejecuta el proyecto usando Gradle:
    <pre><code>./gradlew bootRun</code></pre>
  </li>
</ol>

<h3 id="despliegue-en-la-nube">Despliegue en la nube</h3>
<p>
  El proyecto está desplegado en <a href="https://render.com">Render</a>. Para acceder a la API en la nube:
</p>
<p><strong>URL de la API:</strong> <a href="https://api-mutantes.render.com">https://api-mutantes.render.com</a></p>

<h2 id="uso">Uso</h2>

<h3 id="api-local-o-render">API Local o en Render</h3>
<p>
  Puedes interactuar con la API en dos entornos:
</p>
<ul>
  <li><strong>Local:</strong> Disponible en <code>http://localhost:8080</code></li>
  <li><strong>Render:</strong> Disponible en <a href="https://api-mutantes.render.com">https://api-mutantes.render.com</a></li>
</ul>

<h4>Endpoints disponibles:</h4>
<ul>
  <li><strong>POST /mutant:</strong> Verifica si una secuencia de ADN es mutante.</li>
</ul>
<pre><code>
{
  "dna": ["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]
}
</code></pre>

<ul>
  <li><strong>GET /stats:</strong> Devuelve estadísticas sobre las verificaciones de ADN (proporción de mutantes/humanos).</li>
</ul>

<h2 id="ejemplos">Ejemplos</h2>

<h3>Ejemplo de petición para detectar mutante:</h3>
<pre><code>curl -X POST https://api-mutantes.render.com/mutant \
-H 'Content-Type: application/json' \
-d '{"dna": ["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]}'
</code></pre>

<h3>Ejemplo de respuesta para /stats:</h3>
<pre><code>{
  "count_mutant_dna": 40,
  "count_human_dna": 100,
  "ratio": 0.4
}
</code></pre>

<h2 id="pruebas">Pruebas</h2>
<p>
  El proyecto incluye pruebas unitarias para las funcionalidades principales. Para ejecutarlas, utiliza Gradle:
</p>
<pre><code>./gradlew test</code></pre>
<p>Los resultados de las pruebas se pueden encontrar en <code>build/reports/tests/test/index.html</code>.</p>
