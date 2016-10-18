-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 18 Octobre 2016 à 15:27
-- Version du serveur :  10.1.16-MariaDB
-- Version de PHP :  5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `toutbois`
--

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

CREATE TABLE `clients` (
  `idcli` int(11) NOT NULL,
  `actif` char(25) NOT NULL,
  `nomens` varchar(25) NOT NULL,
  `siret` varchar(14) NOT NULL,
  `dateder` date NOT NULL,
  `adresse1` varchar(25) NOT NULL,
  `adresse2` varchar(25) NOT NULL,
  `cp` varchar(11) NOT NULL,
  `ville` varchar(25) NOT NULL,
  `pays` varchar(25) NOT NULL,
  `nomcont` varchar(25) NOT NULL,
  `prenomcont` varchar(25) NOT NULL,
  `telfixe` int(11) NOT NULL,
  `telport` int(11) NOT NULL,
  `email` varchar(25) NOT NULL,
  `nbcommandes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `clients`
--

INSERT INTO `clients` (`idcli`, `actif`, `nomens`, `siret`, `dateder`, `adresse1`, `adresse2`, `cp`, `ville`, `pays`, `nomcont`, `prenomcont`, `telfixe`, `telport`, `email`, `nbcommandes`) VALUES
(1, 'oui', 'qsdgf', 'qsdf', '2016-10-10', 'numero, nom de rue', 'complément dadresse', '1542', 'lomme', 'France', 'sdf', 'qsdf', 112485, 12548, 'sd@fr.vr', 0),
(2, 'oui', 'qdsfg', '572', '2014-02-12', 'numero, nom de rue', 'complément ddresse', '1547', 'lomme', 'France', 'qfdgq', 'qsdg', 1254, 32547, 'qdsfg@fr.fr', 0),
(3, 'oui', 'test', '156', '2015-12-24', 'numero, nom de rue', 'complément dadresse', '1564', 'lille', 'France', 'dfg', 'dfg', 26857, 156, 'dg@gt.vo', 0);

-- --------------------------------------------------------

--
-- Structure de la table `prospects`
--

CREATE TABLE `prospects` (
  `idpro` int(11) NOT NULL,
  `actif` char(25) NOT NULL,
  `nomens` varchar(25) NOT NULL,
  `siret` int(11) NOT NULL,
  `dateder` date NOT NULL,
  `adresse1` varchar(25) NOT NULL,
  `adresse2` varchar(25) NOT NULL,
  `cp` int(11) NOT NULL,
  `ville` varchar(25) NOT NULL,
  `pays` varchar(25) NOT NULL,
  `nomcont` varchar(25) NOT NULL,
  `prenomcont` varchar(25) NOT NULL,
  `telfixe` int(11) NOT NULL,
  `telport` int(11) NOT NULL,
  `email` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `representants`
--

CREATE TABLE `representants` (
  `id_rep` int(11) NOT NULL,
  `actif` char(25) NOT NULL,
  `nomrep` varchar(25) NOT NULL,
  `prenomrep` varchar(25) NOT NULL,
  `salaire` float NOT NULL,
  `txcommission` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `representants`
--

INSERT INTO `representants` (`id_rep`, `actif`, `nomrep`, `prenomrep`, `salaire`, `txcommission`) VALUES
(1, 'oui', 'Hollande', 'Francois', 30000, 10),
(2, 'oui', 'Ibraimovich', 'Zlatan', 300000, 10),
(3, 'oui', 'Cisse', 'Loukakou', 20000, 5),
(4, 'oui', 'Valbuena', 'Mathieu', 20000, 3),
(5, 'non', 'sdfhy', 'fgh', 1235, 12),
(6, 'oui', 'dsqfg', 'dfg', 1436, 5),
(7, 'oui', 'cvnb', 'cxwvb', 123, 1),
(8, 'oui', 'dwgfh', 'qzas', 10147, 2),
(9, 'oui', 'dzsf', 'SQDF', 12, 1),
(10, 'non', 'moi', 'etremoi', 100000, 1),
(11, 'non', 'ergt', 'qdfg', 147, 1),
(12, 'oui', 'test', 'moi', 45754, 10),
(13, 'oui', 'Pogba', 'Paul', 25420, 4),
(14, 'oui', 'Wilkinson', 'Johnny', 4500, 2);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`idcli`);

--
-- Index pour la table `prospects`
--
ALTER TABLE `prospects`
  ADD PRIMARY KEY (`idpro`);

--
-- Index pour la table `representants`
--
ALTER TABLE `representants`
  ADD PRIMARY KEY (`id_rep`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
  MODIFY `idcli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `prospects`
--
ALTER TABLE `prospects`
  MODIFY `idpro` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `representants`
--
ALTER TABLE `representants`
  MODIFY `id_rep` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
