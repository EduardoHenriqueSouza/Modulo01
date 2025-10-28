SELECT 
    c.cod_comanda,
    c.data_comanda,
    c.mesa,
    c.nome_cliente,
    ca.nome_cafe,
    ca.descricao,
    i.quantidade,
    ca.preco_unit,
    (i.quantidade * ca.preco_unit) AS preco_total_cafe
FROM Comanda c
JOIN ItemComanda i ON c.cod_comanda = i.cod_comanda
JOIN Cardapio ca ON i.cod_cardapio = ca.cod_cardapio
ORDER BY 
    c.data_comanda,
    c.cod_comanda,
    ca.nome_cafe;