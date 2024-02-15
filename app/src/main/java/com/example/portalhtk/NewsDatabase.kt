package com.example.portalhtk

object NewsDatabase {

    val newsList = listOf(
        News(1, "economia", "Mercado financeiro registra alta após anúncio de medidas econômicas", "As bolsas de valores apresentaram forte alta hoje, impulsionadas pelo anúncio do governo sobre novas medidas para estimular a economia."),
        News(2, "economia", "Desemprego atinge novo recorde no país", "A taxa de desemprego atingiu um novo recorde, refletindo os desafios econômicos enfrentados pela população."),
        News(3, "economia", "Inflação permanece estável no último trimestre", "Os índices de inflação se mantiveram estáveis no último trimestre, trazendo alívio para consumidores e investidores."),
        News(4, "economia", "Novo acordo comercial é firmado com país vizinho", "O governo anunciou a assinatura de um novo acordo comercial com o país vizinho, visando fortalecer as relações econômicas bilaterais."),
        News(5, "economia", "Setor de tecnologia lidera crescimento do PIB", "O setor de tecnologia foi o principal impulsionador do crescimento do Produto Interno Bruto (PIB) no último trimestre."),
        News(6, "economia", "Investimentos estrangeiros batem recorde no país", "O país atraiu um volume recorde de investimentos estrangeiros no último ano, sinalizando confiança dos investidores na economia local."),
        News(7, "politica", "Deputados aprovam lei de reforma tributária após longo debate no congresso", "Após meses de negociações, o congresso finalmente aprovou a tão aguardada lei de reforma tributária, com o objetivo de simplificar o sistema e reduzir a carga tributária sobre empresas e indivíduos."),
        News(8, "politica", "Senado aprova aumento do salário mínimo", "O Senado aprovou um aumento significativo no salário mínimo, buscando melhorar as condições de vida dos trabalhadores."),
        News(9, "politica", "Presidente sanciona lei de incentivo à educação", "O presidente sancionou uma nova lei que visa incentivar a educação, oferecendo benefícios fiscais para empresas que investem em programas educacionais."),
        News(10, "politica", "Suprema Corte decide a favor de reforma política", "A Suprema Corte decidiu a favor da implementação de uma reforma política ampla, que inclui medidas para combater a corrupção e aumentar a transparência no sistema político."),
        News(11, "politica", "Governo anuncia programa de infraestrutura", "O governo anunciou um ambicioso programa de infraestrutura, com o objetivo de modernizar rodovias, ferrovias e portos em todo o país."),
        News(12, "politica", "Deputados aprovam lei de combate à violência doméstica", "A câmara dos deputados aprovou uma nova lei que fortalece o combate à violência doméstica, aumentando as penas para agressores e oferecendo mais proteção às vítimas."),
        News(13, "esportes", "Time de futebol conquista o campeonato nacional após vitória emocionante", "Em uma partida eletrizante, o time de futebol da cidade sagrou-se campeão nacional após vencer o jogo decisivo nos acréscimos."),
        News(14, "esportes", "Atleta quebra recorde mundial nos 100 metros rasos", "Um atleta brasileiro quebrou o recorde mundial dos 100 metros rasos em uma competição internacional, deixando o país orgulhoso de sua conquista."),
        News(15, "esportes", "Equipe de vôlei feminino conquista medalha de ouro nos Jogos Olímpicos", "A equipe de vôlei feminino do Brasil conquistou a medalha de ouro nos Jogos Olímpicos de Verão, após uma campanha impecável.")
    )

    fun findAll() = newsList

    fun findById(id: Int) = newsList.find{it.id == id}

    fun findByCategory(category: String) = newsList.find{ it.category == category}
}