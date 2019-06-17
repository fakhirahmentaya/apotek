-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Jun 2019 pada 09.50
-- Versi server: 10.1.32-MariaDB
-- Versi PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apotek_pbol`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_obat`
--

CREATE TABLE `data_obat` (
  `kode_obat` int(11) NOT NULL,
  `nama_obat` varchar(50) NOT NULL,
  `jenis_obat` enum('Obat Luar','Obat Minum','Salep') NOT NULL,
  `kategori_obat` enum('Cair','Kaplet','Pil','Tablet','Tablet Hisap') NOT NULL,
  `harga` int(20) NOT NULL,
  `stok` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_obat`
--

INSERT INTO `data_obat` (`kode_obat`, `nama_obat`, `jenis_obat`, `kategori_obat`, `harga`, `stok`) VALUES
(110001, 'Panadol Extra', 'Obat Minum', 'Cair', 12000, 10),
(110002, 'Panadol Cold', 'Obat Minum', 'Cair', 11000, 12),
(110003, 'Sanmol', 'Obat Minum', 'Tablet', 4500, 9),
(110004, 'Betadine', 'Obat Luar', 'Cair', 9500, 3);

--
-- Trigger `data_obat`
--
DELIMITER $$
CREATE TRIGGER `stok_obat_trg_1` BEFORE INSERT ON `data_obat` FOR EACH ROW begin
	insert into stok_obat values(new.kode_obat,DATE_ADD(CURDATE() , interval 3 month));
end
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `stok_obat_trg_2` BEFORE DELETE ON `data_obat` FOR EACH ROW begin
	delete from stok_obat where kode_obat = old.kode_obat;
end
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `stok_obat`
--

CREATE TABLE `stok_obat` (
  `kode_obat` int(11) NOT NULL,
  `tgl_kadaluarsa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `stok_obat`
--

INSERT INTO `stok_obat` (`kode_obat`, `tgl_kadaluarsa`) VALUES
(110001, '2019-09-07'),
(110002, '2019-09-09'),
(110003, '2020-05-08'),
(110004, '2019-09-16');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'yaya', '12345'),
(2, 'bebe', '67890'),
(3, 'nadia', '09876');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_obat`
--
ALTER TABLE `data_obat`
  ADD PRIMARY KEY (`kode_obat`);

--
-- Indeks untuk tabel `stok_obat`
--
ALTER TABLE `stok_obat`
  ADD UNIQUE KEY `kode_obat` (`kode_obat`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
