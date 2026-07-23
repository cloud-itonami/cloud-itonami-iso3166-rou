# Business Model — Romania

## Offer
- SEAP / SICAP electronic public procurement system
- ONRC commercial register + CUI tax ID
- EU member — no national-content quota; EU single-market access
- general-law compliance catalog (`src/statute/facts.cljc`): Legea
  societăților nr. 31/1990 (companies law — extends the same `onrc.ro`
  citation this business already relies on for CUI/corporate-number
  verification), Legea nr. 190/2018 (measures implementing GDPR
  Regulation (EU) 2016/679, fetched directly from ANSPDCP, Romania's
  data-protection authority), Legea nr. 53/2003 — Codul muncii (labour
  code)

## Trust Controls
- `:filing/submit` never automated
- fabricated claims are HARD holds
- every general-law compliance claim cites the official (or, where
  disclosed, best-available secondary) source in `statute.facts` — never
  invented
